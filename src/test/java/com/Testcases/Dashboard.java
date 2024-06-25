package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WAC_Pages.DashboardPag;

import Base.Base;

public class Dashboard extends Base {

	WebDriver driver;
	DashboardPag das;

	public Dashboard() {
		super();
	}

	@BeforeMethod
	public void rduceCodeSetupMethod() throws Exception {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserNameConfig"));
		loginLounch();
		Thread.sleep(2000);
		das = new DashboardPag(driver);
	}

	@AfterMethod // ----end of the per methods run------
	public void tearDown() {

		driver.quit();
	}

	@Test(priority = 1)
	// Verify navigating to Home Page from 'Shopping Cart' page
	public void DashbordElement() throws Exception {

		das.searchTextBox("Sony");
		das.searchButton();
		das.searchAddToCart();
		Thread.sleep(4000);
	}

}
