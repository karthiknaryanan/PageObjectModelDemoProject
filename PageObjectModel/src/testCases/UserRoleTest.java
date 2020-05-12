package testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import commonFunctions.CommonMethods;

import pageObjects.AdminPageObjects;


public class UserRoleTest extends CommonMethods {

	/*
	 * public void login() {
	 * 
	 * PageFactory.initElements(driver, LoginPageObjects.class);
	 * LoginPageObjects.txtUsername.sendKeys(properties.getProperty("username"));
	 * LoginPageObjects.txtPassword.sendKeys(properties.getProperty("password"));
	 * LoginPageObjects.btnLogin.click(); }
	 */
	
	public void moveToUsers() {
		Actions actions = new Actions(driver);
		actions.moveToElement(AdminPageObjects.admin);
		actions.moveToElement(AdminPageObjects.userManagement);
		actions.moveToElement(AdminPageObjects.users);
		actions.click().build().perform();
	}
	public void selectUserRole() {
		Select select = new Select(AdminPageObjects.userRoleValue);
		select.selectByIndex(1);
	}
	public void selectUserStatus() {
		Select select = new Select(AdminPageObjects.userStatusValue);
		select.selectByIndex(1);
	}
	public void search() {
		AdminPageObjects.searchBtn.click();
	}

	
	@Test
	public void verifyUserValues() {
		//login();
		PageFactory.initElements(driver, AdminPageObjects.class);
		moveToUsers();
		selectUserRole();
		selectUserStatus();
		search();
		
		//String actualMessage = AdminPageObjects.userRoleValue.getText();
		//String actualMessage1 = AdminPageObjects.userStatusValue.getText();
		//Assert.assertEquals(actualMessage, "Admin");
	
	
	}

}
