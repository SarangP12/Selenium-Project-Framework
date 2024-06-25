package com.WAC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FootersElementPage {

	WebDriver driver;

	// element
	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"About Us\"]")
	WebElement Footer_AboutUs;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"Delivery Information\"]")
	WebElement Footer_DeliveryInformation;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"Privacy Policy\"]")
	WebElement Footer_PrivacyPolicy;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"Terms & Conditions\"]")
	WebElement Footer_TermsConditions;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"Contact Us\"]")
	WebElement Footer_ContactUs;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"Join the newsletter\"]")
	WebElement Footer_JoinNewsletter;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"My Account\"]")
	WebElement Footer_MyAccount;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"Order History\"]")
	WebElement Footer_OrderHistory;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"Shopping Cart\"]")
	WebElement Footer_ShoppingCart;

	@FindBy(xpath = "//ul[@class=\"list-unstyled\"]//a[text()=\"Checkout\"]")
	WebElement Footer_Checkout;

//	Assertion element
	@FindBy(xpath = "//h1[text()=\"About Us\"]")
	WebElement Footer_AeertionAbout;

	@FindBy(xpath = "//h1[text()=\"Delivery Information\"]")
	WebElement Footer_AeertionDeliveryInformation;

	@FindBy(xpath = "//h1[text()=\"Privacy Policy\"]")
	WebElement Footer_AeertionPrivacyPolicy;

	@FindBy(xpath = "//h1[text()=\"Terms & Conditions\"]")
	WebElement Footer_AeertionTermsConditions;

	@FindBy(xpath = "//h6[text()=\"Contact Us\"]")
	WebElement Footer_AeertionContactForm;

	@FindBy(xpath = "//h4[text()=\"Subscribe Newsletter\"]")
	WebElement Footer_AeertionSubscribeNewsletter;

	// All my account option same assirtion without login
	@FindBy(xpath = "//h2[text()=\"New Customer\"]")
	WebElement Footer_AeertionMyAccount;

	@FindBy(xpath = "//h2[text()=\"Shopping Cart\"]")
	WebElement Footer_AssertionShopingCart;

	// Constructore call
	public FootersElementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Action methods
	public void click_AboutUs() {
		Footer_AboutUs.click();
	}

	public void click_DeliveryInformation() {
		Footer_DeliveryInformation.click();
	}

	public void click_PrivacyPolicy() {
		Footer_PrivacyPolicy.click();
	}

	public void click_TermsConditions() {
		Footer_TermsConditions.click();
	}

	public void click_ContactUs() {
		Footer_ContactUs.click();
	}

	public void click_JoinNewsletter() {
		Footer_JoinNewsletter.click();
	}

	public void clickFooter_MyAccount() {
		Footer_MyAccount.click();
	}

	public void click_OrderHistory() {
		Footer_OrderHistory.click();
	}

	public void clickFooter_ShoppingCart() {
		Footer_ShoppingCart.click();
	}

	public void clickFooter_Checkout() {
		Footer_Checkout.click();
	}

	// Assertion methode
	public boolean assert_AboutUs() {
		boolean About = Footer_AeertionAbout.isDisplayed();
		return About;
	}

	public boolean asser_DeliveryInformation() {
		boolean About = Footer_AeertionDeliveryInformation.isDisplayed();
		return About;
	}

	public boolean asser_PrivacyPolicy() {
		boolean PrivacyPolicy = Footer_AeertionPrivacyPolicy.isDisplayed();
		return PrivacyPolicy;
	}

	public boolean asser_TermsConditions() {
		boolean term = Footer_AeertionTermsConditions.isDisplayed();
		return term;
	}

	public boolean asser_ContactForm() {
		boolean ContactForm = Footer_AeertionContactForm.isDisplayed();
		return ContactForm;
	}

	public boolean asser_SubscribeNews() {
		boolean SubscribeNews = Footer_AeertionSubscribeNewsletter.isDisplayed();
		return SubscribeNews;
	}

	public boolean asser_MyAccount() {
		boolean MyAccount = Footer_AeertionMyAccount.isDisplayed();
		return MyAccount;
	}

	public boolean asser_ShopingCart() {
		boolean ShopingCart = Footer_AssertionShopingCart.isDisplayed();
		return ShopingCart;
	}
}
