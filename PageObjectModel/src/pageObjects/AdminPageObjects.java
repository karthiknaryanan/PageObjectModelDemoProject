package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPageObjects {

	@FindBy(xpath = "//b[text()='Admin']")
	public static WebElement admin;
	@FindBy(id = "menu_admin_UserManagement")
	public static WebElement userManagement;
	@FindBy(id = "menu_admin_viewSystemUsers")
	public static WebElement users;
	@FindBy(name = "searchSystemUser[userType]")
	public static WebElement userRole;
	@FindBy(name = "searchSystemUser[status]")
	public static WebElement userStatus;
	public static WebElement searchBtn;
	@FindBy(xpath = "//table[@id='resultTable']/tbody[1]/tr[1]/td[3]")
	public static WebElement userRoleValue;
	@FindBy(xpath = "//td[text()='Enabled']")
	public static WebElement userStatusValue;
}
