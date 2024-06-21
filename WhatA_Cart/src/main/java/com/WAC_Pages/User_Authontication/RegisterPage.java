package com.WAC_Pages.User_Authontication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public WebDriver driver;
	
	//Find Webelement	
	
	@FindBy(xpath = "//span[text()=\"My Account\"]")
	WebElement MyAccountclick;
	
	@FindBy(xpath = "//a[text()=\"Register\"]")
	WebElement RegisterAccountClick;
	
	@FindBy(xpath = "//a[text()=\"Continue\"]")
	WebElement ContinewRegisterClick;
	
	@FindBy(name = "Customer[username]")
	WebElement Register_UserName;
	
	//.................................................................................
	
	@FindBy(xpath ="//span[@id=\"select2-chosen-1\"]")//dropdown select
	WebElement Register_timezon_Select;
	
//	@FindBy(id ="//input[@id=\"s2id_autogen1_search\"]")//Dropdown Search
//	WebElement Register_timezon1;
	
	@FindBy(xpath = "//div[text()=\"Indian/Maldives\"]")
	WebElement Register_timezon_TimzonSelect;
	
//...........................................................................................
	
	
	@FindBy(name = "Customer[password]")
	WebElement Register_password;
	
	@FindBy(name = "Customer[confirmPassword]")
	WebElement Register_ConfirmPass;
	
	@FindBy(xpath = "//a[text()=\"Person\"]")
	WebElement Register_Person;
	
	@FindBy(name = "Person[firstname]")
	WebElement Register_FirstName;
	
	@FindBy(name = "Person[lastname]")
	WebElement Register_LastName;
	
	@FindBy(name = "Person[email]")
	WebElement Register_Email;
	
	@FindBy(name = "Person[mobilephone]")
	WebElement Register_Mobile;
	
	@FindBy(xpath = "//input[@id=\"person-profile_image\"]")
	WebElement Register_ProfileImage;
	
	@FindBy(xpath = "//a[text()=\"Address\"]")
	WebElement Register_Adress;
	
	@FindBy(name = "Address[address1]")
	WebElement Register_Adress1;
	
	@FindBy(name = "Address[address2]")
	WebElement Register_Adress2;
	
	@FindBy(name = "Address[city]")
	WebElement Register_City;
	
	@FindBy(name = "Address[state]")
	WebElement Register_State;
	
	@FindBy(xpath = "//span[@id=\"select2-chosen-2\"]")
	WebElement SelectClick;
	
	@FindBy(xpath = "//div[text()=\"India\"]")//div[@id=\"select2-drop\"]
	WebElement dropDownSelectedElement;
	
	@FindBy(xpath = "//span[text()=\"--Select--\"][@id=\"select2-chosen-2\"]")
	WebElement Register_Country;
	
	@FindBy(name = "Address[postal_code]")
	WebElement Register_PostalCode;
	
	@FindBy(id = "save")
	WebElement Register_ContinewButtonRegister;
	
	//Assert element
	@FindBy(xpath = "//div[@id=\"formErrorsInfo\"]")
	WebElement MainErrorMsgBlankfield;
	
//	@FindBy(id = "formErrorsInfo")
//	WebElement MainErrorMsgBlankfield;
	
	@FindBy(xpath = "//a[text()=\"General\"]")
	WebElement generalRegistrPagElement;
	
	@FindBy(xpath = "//p[text()=\"Username cannot be blank.\"]")
	WebElement ErrorMsgBlankfield;
	
	@FindBy(xpath = "//p[text()=\"Postal Code cannot be blank.\"]")
	WebElement ErrorMsgBlankfield1;
	
	@FindBy(xpath ="//div[@id=\"formErrorsInfo\"]")
	WebElement RegisterErrormsg;
	
	@FindBy(xpath ="//*[@id=\"w10-success-0\"]")
	WebElement SuccessfullMsg;
	
	
	//call constructor
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Action Method
	public void myAccoountRegister() {
		MyAccountclick.click();
		RegisterAccountClick.click();
	}
	public void contineRegisterwButton() {
		ContinewRegisterClick.click();
	}
	public void registerUserName(String Uname) {
		Register_UserName.sendKeys(Uname);
	}
	public void selectTimeZone() {
		Register_timezon_Select.click();
		Register_timezon_TimzonSelect.click();
	}
	
//	public void selectTimeZone() throws Exception {
//		WebElement cityDropdown = driver.findElement(By.xpath("//*[@id=\"s2id_customer-timezone\"]/a/span[1]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cityDropdown);
//        cityDropdown.click();
//        
//        WebElement cityOption = driver.findElement(By.xpath("//div[@id='select2-drop']//ul//li/div[contains(text(), ' + timezone + ')]"));
//        cityOption.click();
//	}
		
//		
		
		//ul[@class="select2-results"][@id="select2-results-1"]------select Ul list
		//span[@id="select2-chosen-1"][@class="select2-chosen"]-------select dropdown
//		Select sel=new Select(Register_timezon);
//		
//		//select by Indext method
//		sel.selectByIndex(1);
		
		//selct by Visible text method
		//sel.selectByVisibleText("Asia/Kolkata");
//		
//		//select by Value method
//		sel.selectByValue("Asia/Kolkata");
//	}

	public void registerPassword(String Upass) {
		Register_password.sendKeys(Upass);
	}
	public void registerConfirmPassword(String UConfirmpass) {
		Register_ConfirmPass.sendKeys(UConfirmpass);
	}
	public void person() {
		Register_Person.click();
	}
	public void registerFirstName(String Fname) {
		Register_FirstName.sendKeys(Fname);
	}
	public void registerLastName(String Lname) {
		Register_LastName.sendKeys(Lname);
	}
	public void registerEmail(String Remail) {
		Register_Email.sendKeys(Remail);
	}
	public void registerMobile(String Rmobile) {
		Register_Mobile.sendKeys(Rmobile);
	}
	public void registerAdress() {
		Register_Adress.click();
	}
	public void registerAdress1(String adress1) {
		Register_Adress1.sendKeys(adress1);
	}
	public void registerAdress2(String adress2) {
		Register_Adress2.sendKeys(adress2);
	}
	public void registerCity(String City) {
		Register_City.sendKeys(City);
	}
	
	public void registerState(String state) {
		Register_State.sendKeys(state);
	}
	public void selectCountry() {
		
		SelectClick.click();
		dropDownSelectedElement.click();

	}
//	public void selectCountry() {
//		
//		Select sc=new Select(Register_Country);
//		sc.selectByIndex(0);
//	}

	public void registerPostalcode(String postalCode) {
		Register_PostalCode.sendKeys(postalCode);
	}
	public void registerSave() {
		Register_ContinewButtonRegister.click();
	}
	
	
	
	
	//Action Assert method
	public boolean general() {
		boolean general=generalRegistrPagElement.isDisplayed();
		return general;
	}
	
	public boolean errormsgBlankfield() {
		boolean error1=ErrorMsgBlankfield.isDisplayed();
		return error1;
	}
	public boolean mainErrormsgBlankfield1() {
		boolean error2=MainErrorMsgBlankfield.isDisplayed();
		return error2;
	}
	public boolean successfullMsg() {
		boolean msg=SuccessfullMsg.isDisplayed();
		return msg;
	}
	public boolean registerErrorMsg() {
		boolean msg=RegisterErrormsg.isDisplayed();
		return msg;
	}
	
}
