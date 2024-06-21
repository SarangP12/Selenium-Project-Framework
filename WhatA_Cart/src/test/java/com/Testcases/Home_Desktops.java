package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.HomePaage;

import Base.Base;

public class Home_Desktops extends Base {
	
    WebDriver driver;
	HomePaage hp;
	
	public Home_Desktops() {
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
	//verify to test the Desktops button working properly.
	public void clickHomepagesHeadeerButton() throws Exception {
		hp.desktopButton();
		Thread.sleep(3000);
		Assert.assertTrue(hp.desktopElement(), "No find desktop element");
	}
	@Test(priority = 2)
	//verify to test the Desktops List shorting properly
	public void clickDesktopsList_Elements() throws Exception {
		hp.desktopButton();
		hp.ListView_button();
		Assert.assertTrue(hp.GridView_Ele());
		Thread.sleep(4000);
	}
	@Test(priority = 3)
	//verify to test the Desktops Grid shorting properly
	public void clickDesktopsGrid_Elements() throws Exception {
		hp.desktopButton();
		hp.grideView_button();
		Assert.assertTrue(hp.GridView_Ele());
		Thread.sleep(4000);
	}
	@Test(priority = 4)
	//verify to test the Desktops shorting_NameASC properly
	public void clickDesktopsNameASC_Elements() throws Exception {
		hp.desktopButton();
		hp.SortNameASC_Dropbox();
		Assert.assertTrue(hp.GridViewShowASC_Ele());
		Thread.sleep(4000);
	}
	@Test(priority = 5)
	//verify to test the Desktops shorting_NameDSC properly
	public void clickDesktopsNameDSC_Elements() throws Exception {
		hp.desktopButton();
		hp.SortNameDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowDSC_Ele());
		Thread.sleep(4000);
	}
	@Test(priority = 6)
	//verify to test the Desktops shorting_PriceASC properly
	public void clickDesktopsPriceASC_Elements() throws Exception {
		hp.desktopButton();
		hp.SortPriceDSC_Dropbox();
		hp.SortPriceASC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceASC_Ele());
		Thread.sleep(4000);
	}
	@Test(priority = 7)
	//verify to test the Desktops shorting_PriceASC properly
	public void clickDesktopsPriceDSC_Elements() throws Exception {
		hp.desktopButton();
		hp.SortPriceDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceDSC_Ele());
		Thread.sleep(4000);
	}
	@Test(priority = 8)
	//verify to test the Desktops shorting_NameASC_PriceASC properly
	public void clickDesktopsNameASC_PriceASC_Elements() throws Exception {
		hp.desktopButton();
		hp.SortNameASC_Dropbox();
		Thread.sleep(2000);
		hp.SortPriceDSC_Dropbox();
		hp.SortPriceASC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceASC_Ele());
		Thread.sleep(2000);
	}
	@Test(priority = 8)
	//verify to test the Desktops shorting_NameDSC_PriceASC properly
	public void clickDesktopsNameDSC_PriceDSC_Elements() throws Exception {
		hp.desktopButton();
		hp.SortNameDSC_Dropbox();
		Thread.sleep(2000);
		hp.SortPriceDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceDSC_Ele());
		Thread.sleep(2000);
	}

}
