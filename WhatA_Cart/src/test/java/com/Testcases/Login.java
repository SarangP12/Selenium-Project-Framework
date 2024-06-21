package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.WAC_Pages.DashboardPag;
import com.WAC_Pages.User_Authontication.LoginPages;

import Base.Base;

public class Login extends Base{


		public WebDriver driver;
		DashboardPag dc;
		LoginPages log;
		
		public Login() {
			super();//we call super class(base class)
		}

		@BeforeMethod
		public void rduceCodeSetupMethod() {
			
			driver=initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
					
		}
		
		@AfterMethod  //----end of the per methods run------
		public void tearDown() {
			
			driver.quit(); 
			
		}
		@Test(priority = 0)
		public void loginWithValidCredintials() throws Exception {
			
			loginLounch();
			Thread.sleep(3000);
			
			//assert
			dc=new DashboardPag(driver);
			Assert.assertTrue(dc.dashboardElement(),"There Not Display Dashbord element");
			Thread.sleep(3000);
		}
		
		//using dataprovoider login 
		@Test(priority = 1,dataProvider = "supplytestdata")
		public void valideInvalidCredentialwithLogin(String usernm,String pass) {
			
			driver.findElement(By.name("LoginForm[username]")).sendKeys(usernm);
			driver.findElement(By.name("LoginForm[password]")).sendKeys(pass);
			driver.findElement(By.id("savebutton")).click();
		}
		@DataProvider 
		public Object[][] supplytestdata() {
			
			Object [][] data= {{"kiran@gmail.com","123456"},
								{"sarang@gmail.com","12345"},
								{"vishal@gmail.com","1234"}};
			return data;
		}
		
		@Test(priority = 2)
		//to verify that account login or not with valid credential
		public void loginValideCredentials() {
				
			//Login using base class method
			 loginLounch();
		}
	 
		
		@Test(priority = 2)
		//to verify that account login or not with invalid credential

		public void logiInValideCredentials() throws Exception {
			
    		log=new LoginPages(driver);
			log.enterEmail(prop.getProperty("InvalidEmail"));//we have dont use sendkey method
			log.enterPass(prop.getProperty("InvalidPassword"));
			Thread.sleep(2000);
			log.loginButton();
			Thread.sleep(2000);
			
			Assert.assertTrue(log.getDisplayPassErrorStatusLoginPage1(),"There Not Display Email_Error Msg");
			
		}
		@Test(priority = 3)
		//to verify that account login or not with invalid user/email credential

		public void logiInValideEmailValidPass() throws Exception {
			
    		log=new LoginPages(driver);
			log.enterEmail(prop.getProperty("InvalidEmail"));//we have dont use sendkey method
			Thread.sleep(2000);
			log.enterPass(prop.getProperty("validPassConfig"));
			Thread.sleep(2000);
			log.loginButton();
			Thread.sleep(3000);
	
			Assert.assertTrue(log.getDisplayPassErrorStatusLoginPage1(),"There Not Display Email_Error Msg");		
		}
		
		@Test(priority = 4)
		//to verify that account login or not with invalid password credential
		public void loginInValidePasswordValidEmail() throws Exception {
			 
    		log=new LoginPages(driver);
			log.enterEmail(prop.getProperty("valideEmailConfig"));//we have dont use sendkey method
			Thread.sleep(3000);
			log.enterPass(prop.getProperty("InvalidPassword"));
			Thread.sleep(3000);
			log.loginButton();
			Thread.sleep(3000);
			Assert.assertTrue(log.getDisplayPassErrorStatusLoginPage1(),"There Not Display Email_Error Msg");
			
		}
		@Test(priority = 5)
		//to verify that account login blank Credintils
		public void loginBlankPasswordBlankEmail() throws Exception {
			 
    		log=new LoginPages(driver);
			log.enterEmail("");//we have dont use sendkey method
			Thread.sleep(3000);
			log.enterPass("");
			Thread.sleep(3000);
			log.loginButton();
			Thread.sleep(3000);
			Assert.assertTrue(log.getDisplayEmailErrorStatusLoginPage(),"There Not Display Email_Error Msg");
			Assert.assertTrue(log.getDisplayPassErrorStatusLoginPage2(),"There Not Display Email_Error Msg");
		}
		@Test(priority = 6)
		//to verify that account login or not with invalid password credential
		public void loginValidePasswordBlankEmail() throws Exception {
			 
    		log=new LoginPages(driver);
			log.enterEmail("");//we have dont use sendkey method
			Thread.sleep(3000);
			log.enterPass(prop.getProperty("validPassConfig"));
			Thread.sleep(3000);
			log.loginButton();
			Thread.sleep(3000);
			Assert.assertTrue(log.getDisplayEmailErrorStatusLoginPage(),"There Not Display Email_Error Msg");
			
		}
		@Test(priority = 7)
		//to verify that account login or not with invalid password credential
		public void loginBlankPasswordAndValidEmail() throws Exception {
			 
    		log=new LoginPages(driver);
			log.enterEmail(prop.getProperty("valideEmailConfig"));//we have dont use sendkey method
			Thread.sleep(3000);
			log.enterPass("");
			Thread.sleep(3000);
			log.loginButton();
			Thread.sleep(3000);
			Assert.assertTrue(log.getDisplayPassErrorStatusLoginPage2(),"There Not Display Email_Error Msg");
			
		}
}
