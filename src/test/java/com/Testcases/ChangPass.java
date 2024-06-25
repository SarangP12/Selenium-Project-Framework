package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.User_Authontication.ChangePasswordPage;
import com.WAC_Pages.User_Authontication.MyAccountPage;

import Base.Base;

public class ChangPass extends Base {

	WebDriver driver;
	ChangePasswordPage cPass;
	MyAccountPage map;

	public ChangPass() {
		super();
	}

	@BeforeMethod
	public void rduceCodeSetupMethod() throws Exception {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		cPass = new ChangePasswordPage(driver);
		map = new MyAccountPage(driver);
		loginLounch();
		Thread.sleep(3000);
		map.myAccoountTab();
		Thread.sleep(2000);
		cPass.changePassClick();

	}

	@AfterMethod // ----end of the per methods run------
	public void tearDown() {

		driver.quit();

	}

	@Test(priority = 1)
	// To check the pass will be change in using valid credentials
	public void changePaassValid_Credentials() throws InterruptedException {

//		Thread.sleep(2000);
//		cPass.changePassClick();
		Thread.sleep(2000);
		cPass.enter_newPass("Pass@1234");
		cPass.enter_confirmPass("Pass@1234");
		Thread.sleep(2000);
		cPass.saveButton_CP();
		Thread.sleep(2000);
		Assert.assertTrue(cPass.save_successfull(), "The successfull msg dident show in wabepage");
	}

	@Test(priority = 2)
	// To check the New pass will be change in using Invalid credentials
	public void changeNew_PaassINValid_Credentials() throws InterruptedException {

//		Thread.sleep(2000);
//		cPass.changePassClick();
		Thread.sleep(2000);
		cPass.enter_newPass("Pas");
		cPass.enter_confirmPass("Pas@123");
		Thread.sleep(2000);
		cPass.saveButton_CP();
		Thread.sleep(2000);
		Assert.assertTrue(cPass.passNew_ChangeError(), "The error msg dident show in wabepage");
	}

	@Test(priority = 3)
	// To check the confirm pass will be change in using Invalid credentials
	public void changeConfirm_PaassINValid_Credentials() throws InterruptedException {
//
//		Thread.sleep(2000);
//		cPass.changePassClick();
		Thread.sleep(2000);
		cPass.enter_newPass("Pass@123");
		cPass.enter_confirmPass("Pas");
		Thread.sleep(2000);
		cPass.saveButton_CP();
		Thread.sleep(2000);
		Assert.assertTrue(cPass.passConfirmError(), "The error msg dident show in wabepage");
	}

	@Test(priority = 4)
	// To check the cancle button will be work properly or not
	public void cancleButton_ChangePass() throws InterruptedException {

//		Thread.sleep(2000);
//		cPass.changePassClick();
		Thread.sleep(2000);
		cPass.cacleButton_CP();
		Thread.sleep(2000);
		Assert.assertTrue(cPass.myAccount_EmailElement(), "The Updated email dident show in MYaccount Webpage");
	}

	@Test(priority = 5)
	// To check the pass will be change in using valid credentials
	public void changePaasswithout_Credentials() throws InterruptedException {

//		Thread.sleep(2000);
//		cPass.changePassClick();
		Thread.sleep(2000);
		cPass.enter_newPass("");
		cPass.enter_confirmPass("");
		Thread.sleep(2000);
		cPass.saveButton_CP();
		Thread.sleep(2000);
		Assert.assertTrue(cPass.passNew_EmptyChangeError(), "The successfull msg dident show in wabepage");
		// Assert.assertTrue(cPass.pass_ConfirmEmptyChangeError(),"The successfull msg
		// dident show in wabepage");
	}

}
