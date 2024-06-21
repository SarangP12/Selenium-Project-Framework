package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.User_Authontication.RegisterPage;

import Base.Base;

public class Register extends Base {

	WebDriver driver;
	RegisterPage reg;
	
	public Register() {
		super();
	}
	@BeforeMethod
	public void rduceCodeSetupMethod() throws Exception {
		
		driver=initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));		
		reg=new RegisterPage(driver);
		reg.myAccoountRegister();
		Thread.sleep(3000);

	}
	
	@AfterMethod  //----end of the per methods run------
	public void tearDown() {
		
		driver.quit(); 
		
	}
	@Test(priority = 1)
	//To check the Register button work properly 
	public void registerButtonWork() throws Exception {
		Thread.sleep(2000);
		reg.myAccoountRegister();
		Thread.sleep(2000);
		Assert.assertTrue(reg.general());
	}
	@Test(priority = 2)
	//to verify register with Blank data
	public void registerWithBankData() throws Exception {
		
		reg.myAccoountRegister();
		reg.registerUserName("");
//		Thread.sleep(3000);
		
		reg.selectTimeZone();
		Thread.sleep(3000);
		reg.registerPassword("");
		reg.registerConfirmPassword("");
		Thread.sleep(3000);
		
		reg.person();
		Thread.sleep(3000);
		reg.registerFirstName("");
		reg.registerLastName("");
		reg.registerEmail("");
		reg.registerMobile("");
		Thread.sleep(3000);
		reg.registerAdress();
		Thread.sleep(3000);
		reg.registerAdress1("");
		reg.registerAdress2("");
		reg.registerCity("");
		reg.registerState("");
		Thread.sleep(3000);

		reg.selectCountry();
		reg.registerPostalcode("");
		Thread.sleep(3000);
		reg.registerSave();
		Thread.sleep(3000);
		//Assertion
		Assert.assertTrue(reg.mainErrormsgBlankfield1(), "there is no error msg displayed");
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	//to verify register with valid data
	public void registerWithValidData() throws Exception {
		//reg name contineously changes
		reg.registerUserName("sarang105");
		Thread.sleep(3000);
		reg.selectTimeZone();
		Thread.sleep(3000);
		reg.registerPassword("Saru@123");
		reg.registerConfirmPassword("Saru@123");
		Thread.sleep(2000);
		reg.person();
		Thread.sleep(3000);
		reg.registerFirstName("Sagar");
		reg.registerLastName("Pawar");
		//Email has contineously changes
		reg.registerEmail("sag@gmail.com");
		reg.registerMobile("1234567898");
		Thread.sleep(3000);
		reg.registerAdress();
		Thread.sleep(3000);
		reg.registerAdress1("Satara");
		reg.registerAdress2("Satara");
		reg.registerCity("Phaltan");
		reg.registerState("Maharashtra");
		Thread.sleep(3000);
		reg.selectCountry();
		Thread.sleep(3000);
		reg.registerPostalcode("415523");
		Thread.sleep(3000);
		
		reg.registerSave();
		Thread.sleep(6000);
		
		
		Assert.assertTrue(reg.successfullMsg());
		Thread.sleep(6000);

	}
	@Test(priority = 4)
	//to verify register with invalid data
	public void registerWithInvalidData() throws Exception {
		//reg name contineously changes
		reg.registerUserName("sarang105");
		Thread.sleep(3000);
		reg.selectTimeZone();
		Thread.sleep(3000);
		reg.registerPassword("Saru@123");
		reg.registerConfirmPassword("Saru@123");
		Thread.sleep(2000);
		reg.person();
		Thread.sleep(3000);
		reg.registerFirstName("Sagar");
		reg.registerLastName("Pawar");
		//Email has contineously changes
		reg.registerEmail("sag@gmail.com");
		reg.registerMobile("123");
		Thread.sleep(3000);
		reg.registerAdress();
		Thread.sleep(3000);
		reg.registerAdress1("Satara");
		reg.registerAdress2("Satara");
		reg.registerCity("Phaltan");
		reg.registerState("Maharashtra");
		Thread.sleep(3000);
		reg.selectCountry();
		Thread.sleep(3000);
		reg.registerPostalcode("415523");
		Thread.sleep(3000);
		
		reg.registerSave();
		Thread.sleep(6000);
		
		
		Assert.assertTrue(reg.registerErrorMsg());
		Thread.sleep(6000);

	}
}
