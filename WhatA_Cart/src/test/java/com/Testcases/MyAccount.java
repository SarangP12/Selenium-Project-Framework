package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.User_Authontication.MyAccountPage;

import Base.Base;

public class MyAccount extends Base{
	WebDriver driver;
	MyAccountPage map;
	

	public MyAccount(){
	super();
	}
	@BeforeMethod
	public void rduceCodeSetupMethod() throws Exception {
		
		driver=initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		map=new MyAccountPage(driver);
		
		loginLounch();
		Thread.sleep(3000);
     	map.myAccoountTab();
     	map.EditPro_click();

	}
	@AfterMethod  //----end of the per methods run------
	public void tearDown() {
		
		driver.quit(); 
		
	}
	@Test(priority = 1)
	//to click the my account button and check My account page displayed or not
	public void myaccountButon() throws Exception {
		Thread.sleep(3000);
		map.myAccoountTab();
		Thread.sleep(4000);
		Assert.assertTrue(map.myaccountPannelTital(),"The MyAccount pannel not displayed");
	
	}
	@Test(priority = 2)
	//to check the Timezone edited to database(Edit Myaccount Panel)
	public void EditProfile() throws Exception{

		map.editPro_timezone();
		map.editPro_saveButton();
		Thread.sleep(2000);
		Assert.assertTrue(map.editPro_timezonSuccessMsg(),"Timezon not Successfull edited");
	}
	
	@Test(priority = 3)
	//to check the success on edited Valide detais 
	public void EditProfile2() throws Exception{
//     	map.myAccoountTab();
//     	map.EditPro_click();
     	map.editPro_timezone();
		Thread.sleep(2000);
		map.EditPro_PersonTab();
		Thread.sleep(2000);
		map.Fname("sagar");
		map.Lname("Phanse");
		map.email("sh@gmail.com");
		map.mbile("1234");
		Thread.sleep(2000);
		
		map.person_Img("C:\\Users\\prath\\OneDrive\\Desktop\\Passport Size Photos\\IMG_20230412_124032 (1).jpg");
		Thread.sleep(4000);
		map.editPro_adress_Tab();
		map.adress("abcd");
		map.city("Patan");
		Thread.sleep(2000);
		map.state("maharashtra");
		Thread.sleep(2000);
		map.editPro_country();
		Thread.sleep(2000);
		map.p_code("411042");
		map.editPro_saveButton();
		Thread.sleep(2000);
		Assert.assertTrue(map.editPro_timezonSuccessMsg(),"Timezon not Successfull edited");
	}
	@Test(priority = 4)
	//to check the eroor msg display when edited InValide details
	public void EditProfile3() throws Exception{
//     	map.myAccoountTab();
//     	map.EditPro_click();
     	map.editPro_timezone();
		Thread.sleep(2000);
		map.EditPro_PersonTab();
		Thread.sleep(2000);
		map.Fname("123");
		map.Lname("345");
		map.email("sgmail.com");
		map.mbile("sara");
		Thread.sleep(2000);
		map.editPro_adress_Tab();
		map.adress(" ");
		map.city("Patan");
		Thread.sleep(2000);
		map.state(" ");
		Thread.sleep(2000);
		map.editPro_country();
		Thread.sleep(2000);
		map.p_code(" ");
		map.editPro_saveButton();
		Thread.sleep(2000);
		Assert.assertTrue(map.all_Details_FailsAlert(),"Edited Successfully");
		
		//If u check the perticulare Text box element then use those assertion
		/*Assert.assertTrue(map.editPro_FirstNMUNSuccessMsg(),"First not Successfull edited");
		Assert.assertTrue(map.editPro_LastNMUNSuccessMsg(),"Last not Successfull edited");
		Assert.assertTrue(map.editPro_EmailUNSuccessMsg(),"Email not Successfull edited");
		Assert.assertTrue(map.editPro_MobileUNSuccessMsg(),"Mobile not Successfull edited");
		Assert.assertTrue(map.editPro_adressUNSuccessMsg(),"Adress not Successfull edited");
		Assert.assertTrue(map.editPro_CityUNSuccessMsg(),"City not Successfull edited");
		Assert.assertTrue(map.editPro_CountryUNSuccessMsg(),"Country not Successfull edited");
		Assert.assertTrue(map.editPro_PostalCodeUNSuccessMsg(),"Postal code not Successfull edited");
	*/}
	@Test(priority = 5)
	//to check the edited Valide detais are edited or not to database
	public void EditProfile4() throws Exception{
//     	map.myAccoountTab();
//     	map.EditPro_click();
     	map.editPro_timezone();
		Thread.sleep(2000);
		map.EditPro_PersonTab();
		Thread.sleep(2000);
		map.Fname("shivaji");
		map.Lname("Panse");
		map.email("srt@gmail.com");
		map.mbile("12344");
		Thread.sleep(2000);
		map.editPro_adress_Tab();
		map.adress("ab-cdf-cd");
		map.city("Phaltan");
		Thread.sleep(2000);
		map.state("maharashtra");
		Thread.sleep(2000);
		map.editPro_country();
		Thread.sleep(2000);
		map.p_code("411042");
		map.editPro_saveButton();
		Thread.sleep(2000);
		map.myAccountClick();
		Thread.sleep(3000);
		WebElement aString= driver.findElement(By.xpath("//a[contains(@href,'mailto:')]"));
		Thread.sleep(2000);
		Assert.assertTrue(aString.isDisplayed(), "Data Not Added successfully");
	//	if Condition useCondition //a[contains(@href,'mailto:')]
		//Assert.assertTrue(map.editPro_timezonSuccessMsg(),"Timezon not Successfull edited");
	}
}
