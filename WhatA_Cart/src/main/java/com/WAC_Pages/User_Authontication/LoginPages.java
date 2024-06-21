package com.WAC_Pages.User_Authontication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
		
		WebDriver driver;
		//To create a webelement in Page factory design pattern
		
		@FindBy(xpath ="//input[@id=\"loginform-username\"]")
		WebElement loginEmail;
		
		@FindBy(xpath="//input[@id=\"loginform-password\"]")
		WebElement passwordElement;
		
		
		@FindBy(xpath ="//a[text()=\"Forgot Password\"]")
		WebElement loginButtonFogatPassword;
		
		@FindBy(xpath ="//input[@id=\"loginform-rememberme\"]")
		WebElement loginButtonRememberMe;
		
		@FindBy(xpath ="//button[@id=\"savebutton\"]")
		WebElement loginButton;
		
		@FindBy(xpath = "//a[text()=\"Continue\"]")
		WebElement continewButtonRegsteraccountNewCustomer;
		
		
		
		//Assert element
		@FindBy(xpath = "//p[text()=\"Username cannot be blank.\"]")
		WebElement findLoginEmailError;
		
		@FindBy(xpath = "//p[text()=\"The credentials passed are not valid.\"]")
		WebElement LoginPassErrorMsg1;
		
		@FindBy(xpath = "//p[text()=\"Password cannot be blank.\"]")
		WebElement LoginPassErrorMsg2;
		
		
		//constructer call
		public LoginPages(WebDriver driver){
			this.driver=driver;
			//When created object from Loginpage then constructure will automatically initialize
			//PageFactory.initElements(driver, Loginpage.class);----both are same-----
			PageFactory.initElements(driver, this);	
		}
		
		//Actions methodes
		public void enterEmail(String email1) {
			loginEmail.sendKeys(email1);
		}
		public void enterPass(String pass) {
			passwordElement.sendKeys(pass);
		}
		public void loginFogatPassword() {
			
			loginButtonFogatPassword.click();
		}
		public void loginButtonRememberMe() {
			
			loginButtonRememberMe.click();
		}
		public void loginButton() {
			
			loginButton.click();
		}
		public void registerAccount() {
			
			continewButtonRegsteraccountNewCustomer.click();
		}
		
	
//		public RegisterPage clickRegisterMembership() {
//			registermembershipElement.click();
//			return new RegisterPage(driver);
//		}
		
		//Assert Action method
		public boolean getDisplayEmailErrorStatusLoginPage() {
			//Assert element in log in page
			boolean AssertDisplayEmailError=findLoginEmailError.isDisplayed();
			return AssertDisplayEmailError;
		}
		
		public boolean getDisplayPassErrorStatusLoginPage1() {
			
			boolean AssertDisplayPassError=LoginPassErrorMsg1.isDisplayed();
			return AssertDisplayPassError;
		}
		public boolean getDisplayPassErrorStatusLoginPage2() {
			
			boolean AssertDisplayPassError=LoginPassErrorMsg2.isDisplayed();
			return AssertDisplayPassError;
		}

		
}
