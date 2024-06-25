package com.WAC_Pages.User_Authontication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	public WebDriver driver;

	// Find Webelement

	@FindBy(xpath = "//a[contains(@href,'mailto:')]")
	WebElement dynamicElement;
	// ----------------------------CLICKABLE
	// ELEMENT--------------------------------------------------------
	@FindBy(xpath = "//a[@title=\"My Account\"]")
	WebElement ProfileDropdownclick;

	@FindBy(xpath = "//ul[@id=\"w13\"]//a[text()=\"My Account\"]")
	WebElement MyAccount_Dropdown_Click;

	@FindBy(xpath = "//ul[@id=\"accountsidebarlist\"]//a[text()=\"My Account\"]")
	WebElement MyAccount_SideBarClick;

	@FindBy(xpath = "//a[text()=\"Edit Profile\"]")
	WebElement EditProfile1_Click;

	@FindBy(xpath = "//a[text()=\"Person\"]")
	WebElement EditPro_PersonClick;

	@FindBy(xpath = "//a[text()=\"Address\"]")
	WebElement EditPro_adressTab_Click;

	@FindBy(xpath = "//a[@class=\"select2-choice\"]//span[@id=\"select2-chosen-1\"]")
	WebElement EditPro_TimezonDropdown_open;

	@FindBy(xpath = "//a[@class=\"select2-choice\"]//span[@id=\"select2-chosen-2\"]")
	WebElement EditPro_CountryDropdown_open;

	// dropdown select any one timezone
	@FindBy(xpath = "//div[@id=\"select2-drop\"]//div[text()=\"Africa/Abidjan\"]")
	WebElement EditPro_timezonelDrop_timezonSelect;

	// dropdown select any one country
	@FindBy(xpath = "//div[@id=\"select2-drop\"]//div[text()=\"India\"]")
	WebElement EditPro_CountryDrop_CountrySelect;
	// -----------------------------ALERT
	// ELEMENT---------------------------------------------------------------------

	@FindBy(xpath = "//div[@class=\"alert-success alert fade in\"]")
	WebElement EditPro_Main_SuccessMSG;

	@FindBy(xpath = "//p[text()=\"First Name is invalid.\"]")
	WebElement EditPro_FirstNM_UnsuccessMSG;

	@FindBy(xpath = "//p[text()=\"Last Name is invalid.\"]")
	WebElement EditPro_LastNM_UnsuccessMSG;

	@FindBy(xpath = "//p[text()=\"Email is not a valid email address.\"]")
	WebElement EditPro_Email_UnsuccessMSG;

	@FindBy(xpath = "//p[text()=\"Mobile must be a number.\"]")
	WebElement EditPro_Mobile_UnsuccessMSG;

	@FindBy(xpath = "//p[text()=\"Address1 cannot be blank.\"]")
	WebElement EditPro_adress_UnsuccessMSG;

	@FindBy(xpath = "//p[text()=\"City cannot be blank.\"]")
	WebElement EditPro_City_UnsuccessMSG;

	@FindBy(xpath = "//p[text()=\"Country cannot be blank.\"]")
	WebElement EditPro_Country_UnsuccessMSG;

	@FindBy(xpath = "//p[text()=\"Postal Code cannot be blank.\"]")
	WebElement EditPro_PostalCode_UnsuccessMSG;

	@FindBy(xpath = "//div[@class=\"alert alert-danger\"]")
	WebElement all_DetailsElement_Fails;
	// --------------------------BUTTON-ELEMENT------------------------------------------------------
	@FindBy(id = "save")
	WebElement editPro_timezon_SaveButtonElement;
	// --------------------------ASSERT
	// LABLE--ELEMENT----------------------------------------------------
	@FindBy(xpath = "//div[@class=\"panel-title\"]")
	WebElement lableMyAccountElement;

	// ................................TEXT
	// BOX.ELEMENT...............................................

	@FindBy(xpath = "//input[@id=\"person-firstname\"]")
	WebElement EditPro_person_FirstNm;

	@FindBy(xpath = "//input[@id=\"person-lastname\"]")
	WebElement EditPro_person_LastNm;

	@FindBy(xpath = "//input[@id=\"person-email\"]")
	WebElement EditPro_person_Email;

	@FindBy(xpath = "//input[@id=\"person-mobilephone\"]")
	WebElement EditPro_person_Mobil;

	@FindBy(xpath = "//input[@id=\"person-profile_image\"]")
	WebElement profile_Img;

	@FindBy(xpath = "//input[@id=\"address-address1\"]")
	WebElement EditPro_person_Adress;

	@FindBy(xpath = "//input[@id=\"address-city\"]")
	WebElement EditPro_person_City;

	@FindBy(xpath = "//input[@id=\"address-state\"]")
	WebElement EditPro_person_State;

	@FindBy(xpath = "//input[@id=\"address-postal_code\"]")
	WebElement EditPro_person_Postalcode;

//-------------------------------PAGE FACTORY INITIALIZATION-------------------------------------------------------
	// call constructor
	// You typically use Page Factory to initialize elements within a Page Object.
	// The PageFactory.initElements(driver, this) initializes the WebElement
	// variables annotated with @FindBy using the provided WebDriver instance.
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//----------------------------ACTION METHODS--------------------------------------------------
	public void dy() {
		dynamicElement.isSelected();
	}

	// Action Method
	public void myAccoountTab() {
		ProfileDropdownclick.click();
		MyAccount_Dropdown_Click.click();
	}

	public void myAccountClick() {
		MyAccount_SideBarClick.click();
	}

	public void EditPro_click() {
		EditProfile1_Click.click();
	}

	public void editPro_timezone() {
		EditPro_TimezonDropdown_open.click();
		EditPro_timezonelDrop_timezonSelect.click();
	}

	public void EditPro_PersonTab() {
		EditPro_PersonClick.click();
	}

	public void editPro_adress_Tab() {
		EditPro_adressTab_Click.click();
	}

	public void Fname(String Fnm) throws InterruptedException {

		EditPro_person_FirstNm.clear();
		Thread.sleep(2000);
		EditPro_person_FirstNm.sendKeys(Fnm);
	}

	public void Lname(String Lnm) throws InterruptedException {
		EditPro_person_LastNm.clear();
		Thread.sleep(2000);
		EditPro_person_LastNm.sendKeys(Lnm);
	}

	public void email(String mail) throws InterruptedException {
		EditPro_person_Email.clear();
		Thread.sleep(2000);
		EditPro_person_Email.sendKeys(mail);
	}

	public void mbile(String mob) throws InterruptedException {
		EditPro_person_Mobil.clear();
		Thread.sleep(2000);
		EditPro_person_Mobil.sendKeys(mob);
	}

	public void person_Img(String imgpath) {
		profile_Img.sendKeys(imgpath);
	}

	public void adress(String adrs) throws InterruptedException {
		EditPro_person_Adress.clear();
		Thread.sleep(2000);
		EditPro_person_Adress.sendKeys(adrs);
	}

	public void city(String city) throws InterruptedException {
		EditPro_person_City.clear();
		Thread.sleep(2000);
		EditPro_person_City.sendKeys(city);
	}

	public void state(String state) throws InterruptedException {
		EditPro_person_State.clear();
		Thread.sleep(2000);
		EditPro_person_State.sendKeys(state);
	}

	public void editPro_country() {
		EditPro_CountryDropdown_open.click();
		EditPro_CountryDrop_CountrySelect.click();
	}

	public void p_code(String code) throws InterruptedException {
		EditPro_person_Postalcode.clear();
		Thread.sleep(2000);
		EditPro_person_Postalcode.sendKeys(code);
	}

	public void editPro_saveButton() {
		editPro_timezon_SaveButtonElement.click();
	}

//--------------------------ASSERT METHODS-----------------------------------------------------------
	// Action Assert method
	public boolean myaccountPannelTital() {
		boolean myaccountPannelTital = lableMyAccountElement.isDisplayed();
		return myaccountPannelTital;
	}

	public boolean editPro_timezonSuccessMsg() {
		boolean editPro_timezonSuccessMsg = EditPro_Main_SuccessMSG.isDisplayed();
		return editPro_timezonSuccessMsg;
	}

	public boolean all_Details_FailsAlert() {
		boolean all_Details_FailsAlert = all_DetailsElement_Fails.isDisplayed();
		return all_Details_FailsAlert;
	}

	public boolean editPro_FirstNMUNSuccessMsg() {
		boolean editPro_FirstNMUNSuccessMsg = EditPro_FirstNM_UnsuccessMSG.isDisplayed();
		return editPro_FirstNMUNSuccessMsg;
	}

	public boolean editPro_LastNMUNSuccessMsg() {
		boolean editPro_LastNMUNSuccessMsg = EditPro_LastNM_UnsuccessMSG.isDisplayed();
		return editPro_LastNMUNSuccessMsg;
	}

	public boolean editPro_EmailUNSuccessMsg() {
		boolean editPro_EmailUNSuccessMsg = EditPro_person_Email.isDisplayed();
		return editPro_EmailUNSuccessMsg;
	}

	public boolean editPro_MobileUNSuccessMsg() {
		boolean editPro_MobileUNSuccessMsg = EditPro_Mobile_UnsuccessMSG.isDisplayed();
		return editPro_MobileUNSuccessMsg;
	}

	public boolean editPro_adressUNSuccessMsg() {
		boolean editPro_adressUNSuccessMsg = EditPro_adress_UnsuccessMSG.isDisplayed();
		return editPro_adressUNSuccessMsg;
	}

	public boolean editPro_CityUNSuccessMsg() {
		boolean editPro_CityUNSuccessMsg = EditPro_City_UnsuccessMSG.isDisplayed();
		return editPro_CityUNSuccessMsg;
	}

	public boolean editPro_CountryUNSuccessMsg() {
		boolean editPro_CountryUNSuccessMsg = EditPro_Country_UnsuccessMSG.isDisplayed();
		return editPro_CountryUNSuccessMsg;
	}

	public boolean editPro_PostalCodeUNSuccessMsg() {
		boolean editPro_PostalCodeUNSuccessMsg = EditPro_PostalCode_UnsuccessMSG.isDisplayed();
		return editPro_PostalCodeUNSuccessMsg;
	}

}
