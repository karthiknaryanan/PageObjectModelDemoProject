package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonMethods;
import pageObjects.LoginPageObjects;

public class LoginTest extends CommonMethods {
	
	@Test
	public void loginTest() {
		
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.txtUsername.sendKeys(properties.getProperty("username"));
		LoginPageObjects.txtPassword.sendKeys(properties.getProperty("password"));
		LoginPageObjects.btnLogin.click();
	}

}
