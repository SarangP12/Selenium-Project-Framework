package com.WAC_Pages.User_Authontication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_PassPage {

	WebDriver driver;
	//----------------------------CLICABLE Elements -------------------------------------------

	@FindBy(xpath = "//a[text()=\"Forgot Password\"]")
	WebElement ForgotPass_click;

	//---------------------SENDKEY ELEMENT------------------------------------------
	@FindBy(xpath = "//input[@id=\"forgotpasswordform-email\"]")
	WebElement ForgotPass_EmailSendkey;

	
	//--------------------------BUTTON ELEMENT----------------------------------------------
	@FindBy(xpath = "//button[@id=\"save\"]")
	WebElement ForgotPass_SaveButton;
	
	@FindBy(xpath = "//a[@id=\"cancel-button\"]")
	WebElement ForgotPass_CancleButton;
	
	//--------------------------ASSERT ELEMENT-----------------------------------------
	@FindBy(xpath = "//div[@class=\"alert-danger alert fade in\"]")
	WebElement ForgotPasssubmit_Email_ErrorElement;
	
	@FindBy(xpath = "//p[text()=\"Email is not a valid email address.\"]")
	WebElement ForgotPasss_InvalidEmail_ErrorElement ;
	
	@FindBy(xpath = "//div[@id=\"w11-warning-0\"]")
	WebElement ForgotPasss_SuccessEmail_Element ;
	
	@FindBy(xpath = "//p[text()=\"Email cannot be blank.\"]")
	WebElement ForgotPasss_BlankEmail_Element ;
	
	@FindBy(xpath = "//h2[text()=\"Returning Customer\"]")
	WebElement Home_Lable;
	
	@FindBy(xpath = "//h6[text()=\"Forgot Password?\"]")
	WebElement Forgot_Password_Lable;
	
	
	//---------------------------PAGE FACTORY INITIALIZATION---------------------------------------------------------------

	public Forgot_PassPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//-------------------------------ACTION METHODS-----------------------------------------------------------

	public void Home_forgotPass_Click() {
		ForgotPass_click.click();
	}
	public void forgotPass_Email(String email) {
		ForgotPass_EmailSendkey.sendKeys(email);
	}
	public void forgotPass_Save() {
		ForgotPass_SaveButton.click();
	}
	public void forgotPass_Cancle() {
		ForgotPass_CancleButton.click();
	}

	//--------------------------ASSERT METHODS-------------------------------------------------------------------------

	public boolean ForgotPassword_Lable() {
		boolean ForgotPassword_Lable=Forgot_Password_Lable.isDisplayed();
		return ForgotPassword_Lable;		
	}
	public boolean forgrtP_Email_Error() {
		boolean forgrtP_Email_Error=ForgotPasssubmit_Email_ErrorElement.isDisplayed();
		return forgrtP_Email_Error;		
	}
	
	public boolean forgrtP_InvalidEmail_Error() {
		boolean forgrtP_InvalidEmail_Error=ForgotPasss_InvalidEmail_ErrorElement.isDisplayed();
		return forgrtP_InvalidEmail_Error;		
	}
	public boolean forgrtP_SuccessEmail() {
		boolean forgrtP_SuccessEmail=ForgotPasss_SuccessEmail_Element.isDisplayed();
		return forgrtP_SuccessEmail;
	}
		
		public boolean forgrtP_BlankEmailError() {
			boolean forgrtP_BlankEmailError=ForgotPasss_BlankEmail_Element.isDisplayed();
			return forgrtP_BlankEmailError;
		
	}
		public boolean ForgrtPass_home_Lable() {
			boolean ForgrtPass_home_Lable=Home_Lable.isDisplayed();
			return ForgrtPass_home_Lable;
		
	}
		
}
