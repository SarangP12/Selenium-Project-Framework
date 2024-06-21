package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.HomePaage;

import Base.Base;

public class Home_Camera extends Base{

    WebDriver driver;
	HomePaage hp;
	
	public Home_Camera() {
		super();
	}
	@BeforeMethod
	public void reduceCodeMethod() throws InterruptedException {
		
		driver=initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		loginLounch();
		Thread.sleep(2000);
		hp=new HomePaage(driver);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	//verify to test the Camera and Notebook working properly.
	public void clickHomepagesHeadeerButton() throws Exception {
		hp.camerabutton();
		Thread.sleep(2000);
		Assert.assertTrue(hp.cameraEment(), "No find desktop element");

	}
	@Test(priority = 2)
	//verify to test the List shorting properly
	public void clickCamerasList_Elements() throws Exception {
		hp.camerabutton();
		hp.ListView_button();
		Assert.assertTrue(hp.GridView_Ele());
		Thread.sleep(4000);
	}
	@Test(priority = 3)
	//verify to test the Camera Grid shorting properly
	public void clickCameraGrid_Elements() throws Exception {
		hp.camerabutton();
		hp.grideView_button();
		Assert.assertTrue(hp.GridView_Ele());
		Thread.sleep(4000);
	}
	@Test(priority = 4)
	//verify to test the Camera shorting_NameASC properly
	public void clickCameraNameASC_Elements() throws Exception {
		hp.camerabutton();
		hp.SortNameASC_Dropbox();
		Assert.assertTrue(hp.GridViewShowASC_Camera());
		Thread.sleep(4000);
	}
	@Test(priority = 5)
	//verify to test the Camera shorting_NameDSC properly
	public void clickCameraNameDSC_Elements() throws Exception {
		hp.camerabutton();
		hp.SortNameDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowDSC_Camera());
		Thread.sleep(4000);
	}
	@Test(priority = 6)
	//verify to test the Camera shorting_PriceASC properly
	public void clickCameraPriceASC_Elements() throws Exception {
		hp.camerabutton();
		hp.SortPriceDSC_Dropbox();
		hp.SortPriceASC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceASC_Camera());
		Thread.sleep(4000);
	}
	@Test(priority = 7)
	//verify to test the Camera shorting_PriceASC properly
	public void clickCameraPriceDSC_Elements() throws Exception {
		hp.camerabutton();
		hp.SortPriceDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceDSC_Camera());
		Thread.sleep(4000);
	}
	@Test(priority = 8)
	//verify to test the Camera shorting_NameASC_PriceASC properly
	public void clickCameraNameASC_PriceASC_Elements() throws Exception {
		hp.camerabutton();
		hp.SortNameASC_Dropbox();
		Thread.sleep(2000);
		hp.SortPriceDSC_Dropbox();
		hp.SortPriceASC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceASC_Camera());
		Thread.sleep(2000);
	}
	@Test(priority = 9)
	//verify to test the Camera shorting_NameDSC_PriceASC properly
	public void clickCameraNameDSC_PriceDSC_Elements() throws Exception {
		hp.camerabutton();
		hp.SortNameDSC_Dropbox();
		Thread.sleep(2000);
		hp.SortPriceDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceDSC_Camera());
		Thread.sleep(2000);
	}
	@Test(priority = 10)
	//verify to test the one Camera Product Click.
	public void clickCameraProduct_Elements() throws Exception {
		hp.camerabutton();
		hp.SortNameASC_Dropbox();
		Thread.sleep(2000);
		hp.SortPriceDSC_Dropbox();
		Thread.sleep(2000);
		hp.click_Camera_Product();
		//Assert.assertTrue(hp.CameraProduct_Description());
		Thread.sleep(2000);
	}
	@Test(priority = 11)
	//verify to test the one Camera Product Click.
	public void clickCameraProduct_() throws Exception {

		clickCameraProduct_Elements();
		Thread.sleep(3000);
		hp.CameraSingleProduct_AddToCartwishlist();
		Thread.sleep(2000);
		Assert.assertTrue(hp.showSingleCameraProduct_AddToWhishlist());
		
		Thread.sleep(2000);
	}

}
