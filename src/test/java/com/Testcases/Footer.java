package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.WAC_Pages.FootersElementPage;

import Base.Base;

public class Footer extends Base {

	WebDriver driver;
	FootersElementPage footer;

	public Footer() {
		super();
	}

	@BeforeSuite
	public void rduceCodeSetupMethod() throws Exception {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		footer = new FootersElementPage(driver);
	}

	@AfterSuite // ----end of the per methods run------
	public void tearDown() {

		driver.quit();

	}

	@Test(priority = 0)
	public void footer_AboutButton() throws Exception {
		footer.click_AboutUs();
		Thread.sleep(2000);
		Assert.assertTrue(footer.assert_AboutUs(), "About not shown Assertion method");

	}

	@Test(priority = 1)
	public void footer_DiliveryInformation() throws Exception {
		footer.click_DeliveryInformation();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_DeliveryInformation(), "Diliveryinformation not shown");
	}

	@Test(priority = 2)
	public void footer_PrivacyPolicy() throws Exception {
		footer.click_PrivacyPolicy();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_PrivacyPolicy(), "Diliveryinformation not shown");
	}

	@Test(priority = 3)
	public void footer_TermsConditions() throws Exception {
		footer.click_TermsConditions();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_TermsConditions(), "Diliveryinformation not shown");
	}

	@Test(priority = 4)
	public void footer_ContactUs() throws Exception {
		footer.click_ContactUs();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_ContactForm(), "Diliveryinformation not shown");
	}

	@Test(priority = 5)
	public void footer_JoinNewsletter() throws Exception {
		footer.click_JoinNewsletter();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_SubscribeNews(), "Diliveryinformation not shown");
	}

	// to test without login footer butons
	@Test(priority = 6)
	public void footer_MyAccount() throws Exception {
		footer.clickFooter_MyAccount();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_MyAccount(), "Diliveryinformation not shown");
	}

	// to test without login footer butons
	@Test(priority = 7)
	public void footer_OrderHistory() throws Exception {
		footer.click_OrderHistory();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_MyAccount(), "Diliveryinformation not shown");
	}

	// to test without login footer butons
	@Test(priority = 8)
	public void footer_ShoppingCart() throws Exception {
		footer.clickFooter_ShoppingCart();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_ShopingCart(), "Diliveryinformation not shown");
	}

	// to test without login footer butons
	@Test(priority = 9)
	public void footer_Checkout() throws Exception {
		footer.clickFooter_Checkout();
		Thread.sleep(2000);
		Assert.assertTrue(footer.asser_MyAccount(), "Diliveryinformation not shown");
	}
}
