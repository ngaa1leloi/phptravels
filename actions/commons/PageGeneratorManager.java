package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.phpTravels.DashboardPageObject;
import pageObjects.phpTravels.LoginPageObject;

public class PageGeneratorManager {
	public static DashboardPageObject getDashboardPage(WebDriver driver) {
		return new DashboardPageObject(driver);
	}

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

}
