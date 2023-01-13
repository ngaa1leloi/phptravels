package com.phptravels.customer;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.phpTravels.DashboardPageObject;
import pageObjects.phpTravels.LoginPageObject;

public class Login extends BaseTest {
	private WebDriver driver;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String password;
	private LoginPageObject loginPage;
	private DashboardPageObject dashboardPage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getDriverBrowser(browserName, url);
		emailAddress = "TestUser" + genarateRanomNumber() + "@mail.vn";
		firstName = "Test";
		lastName = "User";
		password = "123456";

	}

	@Test
	public void Login_01_Success() {
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.inputToEmailTextbox("testuser@phptravels.com");
		loginPage.inputToPasswordTextbox(password);

		dashboardPage = loginPage.clickToLoginButton();

		Assert.assertEquals(dashboardPage.getLoginSuccessMessage(), "Hi, " + firstName + " Welcome Back");
		loginPage = dashboardPage.clickToLogoutButton();
	}
	
	@Test
	public void Login_02_Verify_Elements() {
		loginPage.refreshCurrentPage(driver);
		Assert.assertEquals(loginPage.getPlaceholderOfEmailTextbox(), "Email");
		Assert.assertEquals(loginPage.getPlaceholderOfPasswordTextbox(), "Password1");
	
		loginPage.clickToRememberMeButton();
		Assert.assertTrue(loginPage.isRememberMeCheckboxSelected());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
