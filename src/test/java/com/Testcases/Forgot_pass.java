package com.Testcases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.User_Authontication.Forgot_PassPage;

import Base.Base;

public class Forgot_pass extends Base {

	WebDriver driver;
	Forgot_PassPage fPage;

	public Forgot_pass() {
		super();

	}

	@BeforeMethod
	public void rduceCodeSetupMethod() throws Exception {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		fPage = new Forgot_PassPage(driver);
		// loginLounch();

	}

	@AfterMethod // ----end of the per methods run------
	public void tearDown() {

		driver.quit();
	}

	@Test(priority = 1)
	// To check the forgot pass button working or not
	public void forgetPass_Click() throws InterruptedException {
		fPage.Home_forgotPass_Click();
		Thread.sleep(3000);
		Assert.assertTrue(fPage.ForgotPassword_Lable());
	}

	@Test(priority = 2)
	// enter the forgotpass Validemail
	public void forgetPass_email() throws InterruptedException {
		fPage.Home_forgotPass_Click();
		fPage.forgotPass_Email("psarang.soft.test@gmail.com");
		Thread.sleep(2000);
		fPage.forgotPass_Save();
		Thread.sleep(3000);
		Assert.assertTrue(fPage.forgrtP_SuccessEmail());
	}

	@Test(priority = 3)
	// enter the forgotpass OtherEmailID
	public void forgetPass_InValidemail() throws InterruptedException {
		fPage.Home_forgotPass_Click();
		fPage.forgotPass_Email("sarangpawar625@gmail.com");
		Thread.sleep(2000);
		fPage.forgotPass_Save();
		Thread.sleep(3000);
		Assert.assertTrue(fPage.forgrtP_Email_Error());
	}

	@Test(priority = 4)
	// enter the forgotpass Blankemail
	public void forgetPass_Blankemail() throws InterruptedException {
		fPage.Home_forgotPass_Click();
		fPage.forgotPass_Email("");
		Thread.sleep(2000);
		fPage.forgotPass_Save();
		Thread.sleep(3000);
		Assert.assertTrue(fPage.forgrtP_BlankEmailError());
	}

	@Test(priority = 5)
	// enter the forgotpass Invalidemail
	public void forgetPass_Invalidemail() throws InterruptedException {
		fPage.Home_forgotPass_Click();
		fPage.forgotPass_Email("pasddd");
		Thread.sleep(2000);
		fPage.forgotPass_Save();
		Thread.sleep(3000);
		Assert.assertTrue(fPage.forgrtP_InvalidEmail_Error());
	}

	@Test(priority = 6)
	// To check the forgot Cancle button working or not
	public void forgetPass_CancleClick() throws InterruptedException {
		fPage.Home_forgotPass_Click();
		Thread.sleep(3000);
		fPage.forgotPass_Cancle();
		Thread.sleep(3000);
		Assert.assertTrue(fPage.ForgrtPass_home_Lable());
	}

}
