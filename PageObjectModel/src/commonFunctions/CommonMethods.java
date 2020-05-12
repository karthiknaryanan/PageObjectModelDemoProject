package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger =Logger.getLogger(CommonMethods.class);

	public Properties loadPropertyFile() throws IOException {

		FileInputStream fis = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fis);
		return properties;
	}

	public void launchBrowser() {

		String browser = properties.getProperty("browser").toLowerCase();
		String driverLocation = properties.getProperty("DriverLocation");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
	}

	@BeforeSuite
	public void setUp() throws IOException {
		logger.info("Execution Begins");
		PropertyConfigurator.configure("log4j.properties");
		loadPropertyFile();
		launchBrowser();
		String url = properties.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
