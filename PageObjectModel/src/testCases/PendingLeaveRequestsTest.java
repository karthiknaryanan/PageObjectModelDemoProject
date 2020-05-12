package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonMethods;

import pageObjects.DashBoardPageObjects;
import pageObjects.LoginPageObjects;

public class PendingLeaveRequestsTest extends CommonMethods {
	
	
	/*
	 * public void login() {
	 * 
	 * PageFactory.initElements(driver, LoginPageObjects.class);
	 * LoginPageObjects.txtUsername.sendKeys(properties.getProperty("username"));
	 * LoginPageObjects.txtPassword.sendKeys(properties.getProperty("password"));
	 * LoginPageObjects.btnLogin.click(); }
	 */
	@Test
	public void verifyPendingLeaveRequests() {		
		
		
		//login();
		PageFactory.initElements(driver, DashBoardPageObjects.class);
		DashBoardPageObjects.dashBoard.click();
		String actualText = DashBoardPageObjects.pendingLeaveRequests.getText();
		Assert.assertEquals(actualText, "No Records are Available");
		}
		
		
	}


