package com.WAC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPag {

	
	WebDriver driver;
	
//----------------------------CLICABLE Elements -------------------------------------------
	
	@FindBy(xpath = "//ul[@class=\"breadcrumb\"]//a[text()=\"Home\"]")
	WebElement Dashboard_Home_Button;
	
	@FindBy(xpath = "//a[text()=\"View Cart\"]")
	WebElement Dashboard_ViewCart_Button;
	
	@FindBy(xpath = "//p[@class=\"text-right\"]/a[text()=\"Checkout\"]")
	WebElement CartTotal_Checkout_Button;
	
	@FindBy(id = "cart-total")
	WebElement CartTotal_Button;
	
	@FindBy(xpath = "//p[text()=\"Your shopping cart is empty!\"]")
	WebElement Dashboard_EmptyViewCart_empty;
	
	@FindBy(xpath = "//a[@class=\"cart-remove\"]")
	WebElement CartTotalRemove_Button;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[2]/div[1]/div/div[3]/button[1]")
	WebElement dashboard_Product_AddToCart;
	
	@FindBy(xpath = "//*[@id=\"search-results-list-view\"]/div[1]/div[1]/div/div/div[3]/button[1]")
	WebElement Serach_FirstProduct_AddToCart;

	
	@FindBy(xpath = "//li[@data-slide-to=\"2\"]")
	WebElement dashboard_DataSlideCarousalElement3;
	
	@FindBy(xpath = "//li[@data-slide-to=\"1\"]")
	WebElement dashboard_DataSlideCarousalElement2;
	
	@FindBy(xpath = "//li[@data-slide-to=\"0\"]")
	WebElement dashboard_DataSlideCarousalElement1;
	
	@FindBy(className = "right carousel-control")
	WebElement dashboard_RightCarousalElement;
	
	@FindBy(className = "left carousel-control")
	WebElement dashboard_LeftCarousalElement;
	
	@FindBy(xpath = "//span[text()=\"Compare\"]")
	WebElement Dashboard_Compare_Button;
	
	@FindBy(xpath = "//span[text()=\"Checkout\"]")
	WebElement Dashboard_Checkout_Button;
	
	@FindBy(xpath = "//a[@href=\"/other/Wcart/cart/default/view\"]//span[text()=\"Shopping Cart\"]")
	WebElement Dashboard_ShoppingCart_Button;
	
	@FindBy(xpath = "//span[text()=\"Wish List\"]")
	WebElement Dashboard_WishList_Button;
	
	@FindBy(xpath = "//p[text()=\"Your wish list is empty!\"]")
	WebElement Dashboard_WishList_EmotyMSG;
	
	@FindBy(xpath = "//span[contains(text(),\"Compare \")]")
	WebElement Dashboard_Compare;
	
	//========================Serach TextBox Dashbord=======================
	
	@FindBy(xpath ="//button[@class=\"btn btn-default btn-lg\"]")
	WebElement searchTextButton_Element;
	
	@FindBy(xpath = "/html/body/header/div/div/div[2]/form/div/input")
	WebElement searchRexrBox_element;
	
//---------------------------------Aseert Element------------------------------------
	
	@FindBy(xpath = "//span[text()=\"0 Item(s) - $0.00\"]")
	WebElement Dashboard_USD_Cart_Button;
	
	@FindBy(xpath = "//span[text()=\"0 Item(s) - £0.00\"]")
	WebElement Dashboard_GBP_Cart_Button;
	
	@FindBy(xpath ="//h3[text()=\"Latest Products\"]")
	WebElement DasboardElement;
	
	@FindBy(xpath ="//div[text()=\"No results found.\"]")
	WebElement DasboardCompare_NoDataElement;
	
	@FindBy(xpath = "//div[@id=\"shopping-container\"]//p[text()=\"Your shopping cart is empty!\"]")
	WebElement Dashboard_CheckoutEmptyMG;
	
	@FindBy(xpath ="//span[contains(text(),'Item(s)')]")
	WebElement Dasboard_AddToCart_Element;

	@FindBy(xpath = "//div[text()=\"View Cart\"]")
	WebElement Dashboard_ViewCart;
	
	//first header element
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"][@aria-expanded=\"false\"]")
	WebElement Dashboard_USD_Button;
	
	@FindBy(xpath = "//a[@data-currency-id=\"USD\"]")
	WebElement Dashboard_USD_Button2;
	
	@FindBy(xpath = "//span[text()=\"GBP\"]")
	WebElement Dashboard_GBP_Button;
	
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	WebElement Dashboar_USD2_Button;

//-----------------------PAGE FACTORY INITIALIZATION--------------------------------------
	public DashboardPag(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//-------------------------Action methods-------------------------------------------
	
	public void home_Button() {
		Dashboard_Home_Button.click();
	}
	public void usd_Button() {
		Dashboard_USD_Button.click();
		//Dashboard_USD_Button2.click();
	}
	public void usd_Button2() {
		Dashboard_USD_Button.click();
		//Dashboard_GBP_Button.click();
	}
	public void cart_Button() {
		CartTotal_Button.click();
	}
	public void cartRemove_Button() {
		CartTotalRemove_Button.click();
	}
	public void cartUSD_EmptyButton() {
		Dashboard_USD_Cart_Button.click();
	}
	public void dashboard_ProductAddToCartButton() {
		dashboard_Product_AddToCart.click();
	}
	public void DataSlideCarousalElement3Button() {
		dashboard_DataSlideCarousalElement3.click();
	}
	public void DataSlideCarousalElement2Button() {
		dashboard_DataSlideCarousalElement2.click();
	}
	public void DataSlideCarousalElement1Button() {
		dashboard_DataSlideCarousalElement1.click();
	}
	public void DataSlideRightCarousalElementButton() {
		dashboard_RightCarousalElement.click();
	}
	public void DataSlideLeftCarousalElementButton() {
		dashboard_LeftCarousalElement.click();
	}
	public void Dashboard_Compare_ElementButton() {
		Dashboard_Compare_Button.click();
	}
	public void Dashboard_Checkout_ElementButton() {
		Dashboard_Checkout_Button.click();
	}
	public void Dashboard_ShoppingCart_ElementButton() {
		Dashboard_ShoppingCart_Button.click();
	}
	public void Dashboard_WishList_ElementButton() {
		Dashboard_WishList_Button.click();
	}
	public void Dashboard_USD_ElementButton() {
		Dashboar_USD2_Button.click();
	}
	public void searchTextBox(String text) {
		searchRexrBox_element.sendKeys(text);
	}
	public void searchAddToCart() {
		Serach_FirstProduct_AddToCart.click();
	}
	public void searchButton() {
		searchTextButton_Element.click();
	}
	
//----------------------------Assertion action method----------------------------------
	public boolean dashboardElement() {
		boolean AssertDisplayPassError=DasboardElement.isDisplayed();
		return AssertDisplayPassError;
	}
	public boolean dashboard_USD_Element() {
		boolean AssertUSD=Dashboard_USD_Cart_Button.isDisplayed();
		return AssertUSD;
	}
	public boolean dashboardCartRemove_Element() {
		boolean dashboardCartRemove_Element=Dashboard_USD_Cart_Button.isDisplayed();
		return dashboardCartRemove_Element;
	}
	public boolean dashboardViewCart_EmptyElement() {
		boolean AssertDisplayPassError=Dashboard_EmptyViewCart_empty.isDisplayed();
		return AssertDisplayPassError;
	}
	public boolean dashboardViewCartAddToCart_Element() {
		boolean dashboardViewCartAddToCart_EmptyElement=Dasboard_AddToCart_Element.isDisplayed();
		return dashboardViewCartAddToCart_EmptyElement;
	}
	public boolean dasboardCompare_NoDataEmptyElement() {
		boolean dasboardCompare_NoDataEmptyElement=DasboardCompare_NoDataElement.isDisplayed();
		return dasboardCompare_NoDataEmptyElement;
	}
	public boolean dasboardCheckout_NoDataEmptyElement() {
		boolean dasboardCheckout_NoDataEmptyElement=Dashboard_CheckoutEmptyMG.isDisplayed();
		return dasboardCheckout_NoDataEmptyElement;
	}
	public boolean dasboardShopingCart_NoDataEmptyElement() {
		boolean dasboardShopingCart_NoDataEmptyElement=Dashboard_CheckoutEmptyMG.isDisplayed();
		return dasboardShopingCart_NoDataEmptyElement;
	}
	public boolean dasboardWishList_NoDataEmptyElement() {
		boolean dasboardWishList_NoDataEmptyElement=Dashboard_WishList_EmotyMSG.isDisplayed();
		return dasboardWishList_NoDataEmptyElement;
	}
}
