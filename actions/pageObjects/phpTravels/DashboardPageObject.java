package pageObjects.phpTravels;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.phpTravels.DashboardPageUI;

public class DashboardPageObject extends BasePage {
	WebDriver driver;

	public DashboardPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginSuccessMessage() {
		waitForElementVisible(driver, DashboardPageUI.DASHBOARD_HEADING);
		return getElementText(driver, DashboardPageUI.DASHBOARD_HEADING);
	}

	public LoginPageObject clickToLogoutButton() {
		waitForElementVisible(driver, DashboardPageUI.LOGOUT_BUTTON);
		clickToElement(driver, DashboardPageUI.LOGOUT_BUTTON);
		return PageGeneratorManager.getLoginPage(driver);
	}

}
