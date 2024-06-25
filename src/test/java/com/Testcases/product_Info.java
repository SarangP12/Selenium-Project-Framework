package com.Testcases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.HomePaage;
import com.WAC_Pages.MyOrdersPage;
import com.WAC_Pages.product_Info_Page;
import com.WAC_Pages.User_Authontication.MyAccountPage;

import Base.Base;

public class product_Info extends Base {

	WebDriver driver;
	product_Info_Page pInfo_Page;
	MyOrdersPage moPage;
	MyAccountPage map;
	HomePaage hom;

	public product_Info() {
		super();
	}

	@BeforeMethod
	public void rduceCodeSetupMethod() throws Exception {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		pInfo_Page = new product_Info_Page(driver);
		loginLounch();
		map = new MyAccountPage(driver);
		moPage = new MyOrdersPage(driver);
		hom = new HomePaage(driver);
		Thread.sleep(2000);
		map.myAccoountTab();

	}

	@AfterMethod // ----end of the per methods run------
	public void tearDown() {

		driver.quit();
	}

	@Test(priority = 1)
	// verify to test that the product page should be open or not using the my
	// account page
	public void open_ProductPage() throws InterruptedException {
		moPage.MyOrder_Click();
		Thread.sleep(2000);
		moPage.MyOrder_View_click();
		Thread.sleep(1000);
		moPage.MyOrderViewProductTab_click();
		Thread.sleep(1000);
		moPage.MyOrderViewProductTab_Linklclick();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.myOrderView_DescriptionTab());
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	// verify to test that the product page should be open or not using the home
	// page
	public void open_HomeProductPage() throws InterruptedException {

	}
}
