package com.Testcases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.WAC_Pages.MyOrdersPage;
import com.WAC_Pages.User_Authontication.MyAccountPage;

import Base.Base;

public class MyOrder extends Base {

	WebDriver driver;
	MyOrdersPage moPage;
	MyAccountPage map;

	public MyOrder() {
		super();
	}

	@BeforeMethod
	public void rduceCodeSetupMethod() throws Exception {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		moPage = new MyOrdersPage(driver);
		loginLounch();
		map = new MyAccountPage(driver);
		Thread.sleep(2000);
		map.myAccoountTab();

	}

	@AfterMethod // ----end of the per methods run------
	public void tearDown() {

		driver.quit();
	}

	@Test(priority = 1, groups = "Possitive_TC")
	// Verify that the my order page open
	public void myorder_Click() throws InterruptedException {
		moPage.MyOrder_Click();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.MyOrder_Lable());
	}

	@Test(priority = 2, groups = "Possitive_TC")
	// Verify that the click on my_order_ID when list will be Assending order open
	public void myorder_ID() throws InterruptedException {
		moPage.MyOrder_Click();
		moPage.MyOrder_Id_click();
		Thread.sleep(4000);
		Assert.assertTrue(moPage.MyOrder_IDLable());
	}

	@Test(priority = 3, groups = "Possitive_TC")
	// Verify that the click on my_order_Status when list will be Assending order
	// open
	public void myorder_Status() throws InterruptedException {
		moPage.MyOrder_Click();
		moPage.MyOrder_Status_click();
		Thread.sleep(4000);
		Assert.assertTrue(moPage.MyOrder_StatusLable());
	}

	@Test(priority = 4, groups = "Possitive_TC")
	// Verify that the click on my_order_Amount when list will be Assending order
	// open
	public void myorder_Amount() throws InterruptedException {
		moPage.MyOrder_Click();
		moPage.MyOrder_Amount_click();
		Thread.sleep(4000);
		Assert.assertTrue(moPage.MyOrder_AmountLable());
	}

	@Test(priority = 5, groups = "Possitive_TC")
	// Verify that the click on my_order_Date when list will be Assending order open
	public void myorder_Date() throws InterruptedException {
		moPage.MyOrder_Click();
		moPage.MyOrder_Dates_click();
		Thread.sleep(4000);
		Assert.assertTrue(moPage.MyOrder_DateLable());
	}

	@Test(priority = 6, groups = "Possitive_TC")
	// Verify that the click on my_order_view when show another webpage list
	public void myorder_View() throws InterruptedException {
		moPage.MyOrder_Click();
		moPage.MyOrder_View_click();
		Thread.sleep(4000);
		Assert.assertTrue(moPage.MyOrderView_BrowsLable());
	}

	@Test(priority = 7, groups = "Possitive_TC")
	// Verify that the click on my_order_view_General tab and shows details on
	// general page
	public void myorderView_GeneralClick() throws InterruptedException {

		myorder_View();
		moPage.MOView_Generalclick();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.myOrderView_genaralLable());
		Thread.sleep(1000);
	}

	@Test(priority = 7, groups = "Possitive_TC")
	// Verify that the click on my_order_view_BillingAdress tab and shows details on
	// billing page
	public void myorderView_BillingClick() throws InterruptedException {
		myorder_View();
		moPage.MOView_BillingAdresslclick();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.myOrderView_billingAddressLable());
		Thread.sleep(1000);
	}

	@Test(priority = 8, groups = "Possitive_TC")
	// Verify that the click on my_order_view_ShipingAdress tab and shows details on
	// Shiping page
	public void myorderView_ShipingClick() throws InterruptedException {
		myorder_View();
		moPage.MOView_ShipingAdresslclick();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.myOrderView_ShippingAdressressLable());
		Thread.sleep(1000);
	}

	@Test(priority = 9, groups = "Possitive_TC")
	// Verify that the click on my_order_view_Payment tab and shows details on
	// Payment page
	public void myorderView_PaymentClick() throws InterruptedException {
		myorder_View();
		moPage.MOView_Paymentlclick();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.myOrderView_PaymentTab());
		Thread.sleep(1000);
	}

	@Test(priority = 10, groups = "Possitive_TC")
	// Verify that the click on my_order_view_Product tab and shows details on
	// product page
	public void myorderView_ProductClick() throws InterruptedException {
		myorder_View();
		moPage.MyOrderViewProductTab_click();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.myOrderView_ProductTab());
		Thread.sleep(1000);
	}

	@Test(priority = 11, groups = "Possitive_TC")
	// Verify that the click on my_order_view_Histrory tab and shows details
	public void myorderView_HistoryClick() throws InterruptedException {
		myorder_View();
		moPage.MyOrderViewHistoryTab_click();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.myOrderView_HistoryTab());
		Thread.sleep(1000);
	}

	@Test(priority = 12, groups = "Possitive_TC")
	// Verify that the click on my_order_view_Product_tab Again click on Product
	// name and shows products related all details
	public void myorderView_ProductClick2() throws InterruptedException {
		myorderView_ProductClick();
		moPage.MyOrderViewProductTab_Linklclick();
		Thread.sleep(1000);
		Assert.assertTrue(moPage.myOrderView_DescriptionTab());
		Thread.sleep(1000);
	}
}
