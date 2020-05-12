package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPageObjects {
	
	
	@FindBy(xpath = "//b[text()='Dashboard']")
	public static WebElement dashBoard;
	
	
	@FindBy(xpath = "//td[text()='No Records are Available']")
	public static WebElement pendingLeaveRequests;

}
