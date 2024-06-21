package com.WAC_Pages.User_Authontication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {

	WebDriver driver;
	//----------------------------CLICABLE Elements -------------------------------------------

	@FindBy(xpath = "//a[@title=\"My Account\"]")
	WebElement ProfileDropdownclick;
	
	@FindBy(xpath = "//ul[@id=\"w13\"]//a[text()=\"My Account\"]")
	WebElement MyAccount_Dropdown_Click;
	
	@FindBy(xpath = "//a[text()=\"Change Password\"]")
	WebElement changePassElement;
	//---------------------SENDKEY ELEMENT------------------------------------------
	@FindBy(xpath = "//input[@id=\"changepasswordform-newpassword\"]")
	WebElement changePass_NewPassElement;

	@FindBy(xpath = "//input[@id=\"changepasswordform-confirmpassword\"]")
	WebElement changePass_ConfirmPassElement;
	
	//--------------------------BUTTON ELEMENT----------------------------------------------
	@FindBy(xpath = "//button[@id=\"save\"]")
	WebElement changePass_SaveButton;
	
	@FindBy(xpath = "//a[@id=\"cancel-button\"]")
	WebElement changePass_CancleButton;
	//--------------------------ASSERT ELEMENT-----------------------------------------
	@FindBy(xpath = "//div[@id=\"w11-success-0\"]")
	WebElement save_SuccessMSGElement ;
	
	@FindBy(xpath = "//p[text()=\"New Password is invalid.\"]")
	WebElement PassChangeErrorMSG;
	
	@FindBy(xpath = "//p[text()=\"New Password cannot be blank.\"]")
	WebElement PassChange_NewEmptyFieldErrorMSG;
	
	@FindBy(xpath = "//*[@id=\"changepasswordformview\"]/div[2]/div/p")
	WebElement PassChange_ConfirmEmptyFieldError;
	
	@FindBy(xpath = "//*[@id=\"changepasswordformview\"]/div[2]/div/p")
	WebElement PassChange_Confirm_ErrorMSG;
	
	@FindBy(xpath = "//a[contains(@href,'mailto:')]")
	WebElement myAccount_Email;
	
	
	//---------------------------PAGE FACTORY INITIALIZATION---------------------------------------------------------------

	public ChangePasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//-------------------------------ACTION METHODS-----------------------------------------------------------

	public void changePassClick() {
		changePassElement.click();
	}
	public void enter_newPass(String NP) {
		changePass_NewPassElement.sendKeys(NP);
	}
	public void enter_confirmPass(String CP) {
		changePass_ConfirmPassElement.sendKeys(CP);
	}
	public void  saveButton_CP() {
		changePass_SaveButton.click();
	}
	public void cacleButton_CP() {
		changePass_CancleButton.click();
	}
	
	//--------------------------ASSERT METHODS-------------------------------------------------------------------------

	public boolean save_successfull() {
		boolean save_successfull=save_SuccessMSGElement.isDisplayed();
		return save_successfull;
	}
	public boolean passNew_ChangeError() {
		boolean passChangeError=PassChangeErrorMSG.isDisplayed();
		return passChangeError;
	}
	public boolean passNew_EmptyChangeError() {
		boolean passNew_EmptyChangeError=PassChange_NewEmptyFieldErrorMSG.isDisplayed();
		return passNew_EmptyChangeError;
	}
	public boolean pass_ConfirmEmptyChangeError() {
		boolean pass_ConfirmEmptyChangeError=PassChange_ConfirmEmptyFieldError.isDisplayed();
		return pass_ConfirmEmptyChangeError;
	}
	
	public boolean passConfirmError() {
		boolean passConfirmErro=PassChange_Confirm_ErrorMSG.isDisplayed();
		return passConfirmErro;
	}
	public boolean myAccount_EmailElement() {
		boolean myAccount_EmailElement=myAccount_Email.isDisplayed();
		return myAccount_EmailElement;		
	}
	
}
