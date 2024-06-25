package com.WAC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePaage {

	WebDriver driver;

	// ----------------------------CLICABLE Elements
	// -------------------------------------------

	@FindBy(xpath = "//a[text()=\"Home\"]")
	WebElement HomeLink;

	@FindBy(xpath = "//a[text()=\"Desktops\"]")
	WebElement desktopButttonElement;

	@FindBy(xpath = "//a[text()=\"Laptops & Notebooks\"]")
	WebElement laptopsButtoElement;

	@FindBy(xpath = "//a[text()=\"Camera\"]")
	WebElement cameraElement;

	@FindBy(xpath = "//button[@id=\"list-view\"]")
	WebElement Desktop_ListWiewElement;

	@FindBy(xpath = "//button[@id=\"grid-view\"]")
	WebElement Desktop_GrideWiewElement;

	// -------Select Dropdown Element----------
	@FindBy(xpath = "//select[@id=\"sortBy\"]")
	WebElement SortByElement;

	@FindBy(xpath = "//select[@id=\"showItemsPerPage\"]")
	WebElement ShowItemPerPageElement;

	@FindBy(xpath = "//a[text()=\"Description\"]")
	WebElement clickDescriptionElement;

	@FindBy(xpath = "//div[@class=\"image\"]/a[@href=\"/other/Wcart/catalog/products/site/detail?id=29\"]")
	WebElement CameraIMG_Click_Camera;

	@FindBy(xpath = "//button[@class=\"btn btn-success product-wishlist\"]")
	WebElement CameraSingleProduct_AddToCartwishlist;

	@FindBy(xpath = "//button[@class=\"btn btn-success add-cart-detail\"]")
	WebElement CameraSingleProduct_AddToCartdetail;

	@FindBy(xpath = "//input[@id=\"product_quantity\"]")
	WebElement CameraSingleProduct_AddToCartproduct_quantity;

	@FindBy(xpath = "//button[@class=\"btn btn-success add-product-compare\"]")
	WebElement CameraSingleProduct_compare;

	@FindBy(xpath = "//a[@href=\"#tab-review\"]")
	WebElement CameraSingleProduct_review;

	@FindBy(xpath = "//a[@id=\"product-list-review\"]")
	WebElement CameraSingleProduct_reviewList;

	@FindBy(xpath = "//a[@id=\"product-write-review\"]")
	WebElement CameraSingleProduct_reviewwrite;

	@FindBy(xpath = "//button[@id=\"save\"]")
	WebElement CameraSingleProduct_reviewButton;

	@FindBy(xpath = "//button[@class=\"add-cart\"][@data-productid=\"29\"]")
	WebElement CameraProductPage_AddToCart;

	@FindBy(xpath = "//button[@class=\"product-wishlist\"][@data-productid=\"29\"]")
	WebElement CameraProductPage_wishlist;

	@FindBy(xpath = "//button[@class=\"add-product-compare\"][@data-productid=\"29\"]")
	WebElement CameraProductPage_compare;

	// ---------------------------------Aseert
	// Element------------------------------------
	@FindBy(xpath = "//h2[text()=\"Desktops\"]")
	WebElement desktopElement;

	@FindBy(xpath = "//h2[text()=\"Laptops & Notebooks\"]")
	WebElement LaptopsElement;

	@FindBy(xpath = "//h2[text()=\"Camera\"]")
	WebElement CameraElement;

	@FindBy(xpath = "//div[@id=\"search-results-list-view\"]")
	WebElement GridView_Element;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=1\"]")
	WebElement ShowGridViewShortASC_Desktops;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=45\"]")
	WebElement ShowGridViewShortASC_Laptops;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=29\"]")
	WebElement ShowGridViewShortASC_Camera;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=11\"]")
	WebElement ShowGridViewShortDSC_Desktops;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=56\"]")
	WebElement ShowGridViewShortDSC_Laptops;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=24\"]")
	WebElement ShowGridViewShortDSC_Camera;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=9\"]")
	WebElement ShowGridViewShortPriceASC_Desktops;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=48\"]")
	WebElement ShowGridViewShortPriceASC_Laptops;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=20\"]")
	WebElement ShowGridViewShortPriceASC_Camera;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=9\"]")
	WebElement ShowGridViewShortPriceDSC_Desktops;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=45\"]")
	WebElement ShowGridViewShortPriceDSC_Laptops;

	@FindBy(xpath = "//div[@class=\"caption\"]//a[@href=\"/other/Wcart/catalog/products/site/detail?id=29\"]")
	WebElement ShowGridViewShortPriceDSC_Camera;

	@FindBy(xpath = "//p[text()=\"Review cannot be blank.\"]")
	WebElement showSingleCameraElement_ErrorReviewButton;

	@FindBy(xpath = "//div[@class=\"alert alert-success alert-review\"]")
	WebElement showSingleCamera_SuccessReviewMSG;

	@FindBy(xpath = "//a[contains(text(),\"Wish List \")]")
	WebElement showSingleCamera_AddToWhishlistProduct;

	@FindBy(xpath = "//span[contains(text(),\"Compare \")]")
	WebElement showSingleCamera_AddToCompareProduct;

	// -----------------------PAGE FACTORY
	// INITIALIZATION--------------------------------------
	public HomePaage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ----------------Action Method
	// Call-------------------------------------------------
	public void homeClick() {
		HomeLink.click();
	}

	public void desktopButton() {
		desktopButttonElement.click();
	}

	public void laptopButton() {
		laptopsButtoElement.click();
	}

	public void camerabutton() {
		cameraElement.click();
	}

	public void ListView_button() {
		Desktop_ListWiewElement.click();
	}

	public void grideView_button() {
		Desktop_GrideWiewElement.click();
	}

	public void SortNameASC_Dropbox() {
		Select sel = new Select(SortByElement);
		sel.selectByValue("nameasc");
	}

	public void SortNameDSC_Dropbox() {
		Select sel = new Select(SortByElement);
		sel.selectByValue("namedesc");
	}

	public void SortPriceASC_Dropbox() {
		Select sel = new Select(ShowItemPerPageElement);
		sel.selectByValue("9");
	}

	public void SortPriceDSC_Dropbox() {
		Select sel = new Select(ShowItemPerPageElement);
		sel.selectByValue("54");
	}

	public void ShowItem_Dropbox() {
		Select sel = new Select(ShowItemPerPageElement);
		sel.selectByValue("27");
	}

	public void click_Camera_Product() {
		CameraIMG_Click_Camera.click();
	}

	// --Single Product elements-

	public void click_CameraProduct_Description() {
		clickDescriptionElement.click();
	}

	public void CameraSingleProduct_AddToCartwishlist() {
		CameraSingleProduct_AddToCartwishlist.click();
	}

	public void CameraSingleProduct_AddToCartdetail() {
		CameraSingleProduct_AddToCartdetail.click();
	}

	public void CameraSingleProduct_AddToCartproduct_quantity(String quantity) {
		CameraSingleProduct_AddToCartproduct_quantity.sendKeys(quantity);
	}

	public void CameraSingleProduct_review() {
		CameraSingleProduct_review.click();
	}

	public void CameraSingleProduct_reviewList() {
		CameraSingleProduct_reviewList.click();
	}

	public void CameraSingleProduct_reviewwrite() {
		CameraSingleProduct_reviewwrite.click();
	}

	public void CameraSingleProduct_reviewButton() {
		CameraSingleProduct_reviewButton.click();
	}

	public void CameraSingleProduct_reviewError() {
		showSingleCameraElement_ErrorReviewButton.isDisplayed();
	}

	public void CameraProductPage_AddToCart() {
		CameraProductPage_AddToCart.click();
	}

	public void CameraProductPage_wishlist() {
		CameraProductPage_wishlist.click();
	}

	public void CameraProductPage_compare() {
		CameraProductPage_compare.click();
	}

	// ------------------------Assertio action method------------------------------
	public boolean desktopElement() {
		boolean Desktop = desktopElement.isDisplayed();
		return Desktop;
	}

	public boolean laptopsEment() {
		boolean Laptops = LaptopsElement.isDisplayed();
		return Laptops;
	}

	public boolean cameraEment() {
		boolean Camera = CameraElement.isDisplayed();
		return Camera;
	}

	public boolean GridView_Ele() {
		boolean GridView_Ele = GridView_Element.isDisplayed();
		return GridView_Ele;
	}

	public boolean GridViewShowASC_Ele() {
		boolean GridViewShowASC_Ele = ShowGridViewShortASC_Desktops.isDisplayed();
		return GridViewShowASC_Ele;
	}

	public boolean GridViewShowDSC_Ele() {
		boolean GridViewShowDSC_Ele = ShowGridViewShortDSC_Desktops.isDisplayed();
		return GridViewShowDSC_Ele;
	}

	public boolean GridViewShowPriceASC_Ele() {
		boolean GridViewShowPriceASC_Ele = ShowGridViewShortPriceASC_Desktops.isDisplayed();
		return GridViewShowPriceASC_Ele;
	}

	public boolean GridViewShowPriceDSC_Ele() {
		boolean GridViewShowPriceDSC_Ele = ShowGridViewShortPriceDSC_Desktops.isDisplayed();
		return GridViewShowPriceDSC_Ele;
	}

	public boolean GridViewShowASC_Laptop() {
		boolean GridViewShowASC_Laptop = ShowGridViewShortASC_Laptops.isDisplayed();
		return GridViewShowASC_Laptop;
	}

	public boolean GridViewShowDSC_Laptop() {
		boolean GridViewShowDSC_Laptop = ShowGridViewShortDSC_Laptops.isDisplayed();
		return GridViewShowDSC_Laptop;
	}

	public boolean GridViewShowPriceASC_Laptop() {
		boolean GridViewShowPriceASC_Ele = ShowGridViewShortPriceASC_Laptops.isDisplayed();
		return GridViewShowPriceASC_Ele;
	}

	public boolean GridViewShowPriceDSC_Laptop() {
		boolean GridViewShowPriceDSC_Laptop = ShowGridViewShortPriceDSC_Laptops.isDisplayed();
		return GridViewShowPriceDSC_Laptop;
	}

	public boolean GridViewShowASC_Camera() {
		boolean GridViewShowASC_Camera = ShowGridViewShortASC_Camera.isDisplayed();
		return GridViewShowASC_Camera;
	}

	public boolean GridViewShowDSC_Camera() {
		boolean GridViewShowDSC_Camera = ShowGridViewShortDSC_Camera.isDisplayed();
		return GridViewShowDSC_Camera;
	}

	public boolean GridViewShowPriceASC_Camera() {
		boolean GridViewShowPriceASC_Ele = ShowGridViewShortPriceASC_Camera.isDisplayed();
		return GridViewShowPriceASC_Ele;
	}

	public boolean GridViewShowPriceDSC_Camera() {
		boolean GridViewShowPriceDSC_Camera = ShowGridViewShortPriceDSC_Camera.isDisplayed();
		return GridViewShowPriceDSC_Camera;
	}

	public boolean CameraProduct_Description() {
		boolean CameraProduct_Description = clickDescriptionElement.isDisplayed();
		return CameraProduct_Description;
	}

	public boolean showSingleCameraProduct_AddToWhishlist() {
		boolean showSingleCameraProduct_AddToWhishlist = showSingleCamera_AddToWhishlistProduct.isDisplayed();
		return showSingleCameraProduct_AddToWhishlist;
	}

	public boolean showSingleCameraProduct_AddToCompare() {
		boolean showSingleCameraProduct_AddToWhishlist = showSingleCamera_AddToCompareProduct.isDisplayed();
		return showSingleCameraProduct_AddToWhishlist;
	}
}
