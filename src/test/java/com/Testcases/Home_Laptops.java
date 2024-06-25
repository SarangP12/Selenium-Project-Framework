package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.HomePaage;

import Base.Base;

public class Home_Laptops extends Base {

	WebDriver driver;
	HomePaage hp;

	public Home_Laptops() {
		super();
	}

	@BeforeMethod
	public void reduceCodeMethod() throws InterruptedException {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		loginLounch();
		Thread.sleep(2000);
		hp = new HomePaage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	// verify to test the Laptopes and Notebook working properly.
	public void clickHomepagesHeadeerButton() throws Exception {
		hp.laptopButton();
		Thread.sleep(2000);
		Assert.assertTrue(hp.laptopsEment(), "Laptops are not find");

	}

	@Test(priority = 2)
	// verify to test the List shorting properly
	public void clickLaptopeList_Elements() throws Exception {
		hp.laptopButton();
		hp.ListView_button();
		Assert.assertTrue(hp.GridView_Ele());
		Thread.sleep(4000);
	}

	@Test(priority = 3)
	// verify to test the Laptopes Grid shorting properly
	public void clickLaptopeGrid_Elements() throws Exception {
		hp.laptopButton();
		hp.grideView_button();
		Assert.assertTrue(hp.GridView_Ele());
		Thread.sleep(4000);
	}

	@Test(priority = 4)
	// verify to test the Laptopes shorting_NameASC properly
	public void clickLaptopeNameASC_Elements() throws Exception {
		hp.laptopButton();
		hp.SortNameASC_Dropbox();
		Assert.assertTrue(hp.GridViewShowASC_Laptop());
		Thread.sleep(4000);
	}

	@Test(priority = 5)
	// verify to test the Laptops shorting_NameDSC properly
	public void clickLaptopeNameDSC_Elements() throws Exception {
		hp.laptopButton();
		hp.SortNameDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowDSC_Laptop());
		Thread.sleep(4000);
	}

	@Test(priority = 6)
	// verify to test the Laptopes shorting_PriceASC properly
	public void clickLaptopsPriceASC_Elements() throws Exception {
		hp.laptopButton();
		hp.SortPriceDSC_Dropbox();
		hp.SortPriceASC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceASC_Laptop());
		Thread.sleep(4000);
	}

	@Test(priority = 7)
	// verify to test the Laptopes shorting_PriceASC properly
	public void clickLaptopsPriceDSC_Elements() throws Exception {
		hp.laptopButton();
		hp.SortPriceDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceDSC_Laptop());
		Thread.sleep(4000);
	}

	@Test(priority = 8)
	// verify to test the Laptopes shorting_NameASC_PriceASC properly
	public void clickLaptopsNameASC_PriceASC_Elements() throws Exception {
		hp.laptopButton();
		hp.SortNameASC_Dropbox();
		Thread.sleep(2000);
		hp.SortPriceDSC_Dropbox();
		hp.SortPriceASC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceASC_Laptop());
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	// verify to test the Laptopes shorting_NameDSC_PriceASC properly
	public void clickLaptopsNameDSC_PriceDSC_Elements() throws Exception {
		hp.laptopButton();
		hp.SortNameDSC_Dropbox();
		Thread.sleep(2000);
		hp.SortPriceDSC_Dropbox();
		Thread.sleep(2000);
		Assert.assertTrue(hp.GridViewShowPriceDSC_Laptop());
		Thread.sleep(2000);
	}

}
