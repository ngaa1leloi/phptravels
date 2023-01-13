package pageObjects.phpTravels;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.phpTravels.LoginPageUI;

public class LoginPageObject extends BasePage {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		senKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAddress);

	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		senKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);

	}

	public DashboardPageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getDashboardPage(driver);
	}

	public String getPlaceholderOfEmailTextbox() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		return getElementAttribute(driver, LoginPageUI.EMAIL_TEXTBOX, "placeholder");
	}

	public String getPlaceholderOfPasswordTextbox() {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		return getElementAttribute(driver, LoginPageUI.PASSWORD_TEXTBOX, "placeholder");
	}

	public void clickToRememberMeButton() {
		waitForElementClickable(driver, LoginPageUI.REMEMBER_ME_LABEL);
		clickToElement(driver, LoginPageUI.REMEMBER_ME_LABEL);
	}
	
	public boolean isRememberMeCheckboxSelected() {
		return isEmlementSelected(driver, LoginPageUI.REMEMBER_ME_CHECKBOX);
	}
}
