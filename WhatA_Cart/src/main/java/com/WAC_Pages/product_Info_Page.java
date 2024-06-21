package com.WAC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product_Info_Page {

	WebDriver driver;
	
	//----------------------------CLICABLE Elements -------------------------------------------

	@FindBy(xpath = "//a[text()=\"My Orders\"]")
	WebElement MyOrder_click;
	
	@FindBy(xpath = "//a[text()=\"Order Id\"]")
	WebElement MyOrder_Idclick;
	
	@FindBy(xpath = "//a[text()=\"Status\"]")
	WebElement MyOrder_Statusclick;
	
	@FindBy(xpath = "//a[text()=\"Amount\"]")
	WebElement MyOrder_Amountclick;
	
	//---------------------SENDKEY ELEMENT------------------------------------------
	
	//--------------------------BUTTON ELEMENT----------------------------------------------

	//--------------------------ASSERT ELEMENT-----------------------------------------

	//---------------------------PAGE FACTORY INITIALIZATION---------------------------------------------------------------

	public product_Info_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//-------------------------------ACTION METHODS-----------------------------------------------------------

	public void MyOrder_Click() {
		MyOrder_click.click();
	}
	public void MyOrder_Id_click() {
		MyOrder_Idclick.click();
	}
	public void MyOrder_Status_click() {
		MyOrder_Statusclick.click();
	}
	public void MyOrder_Amount_click() {
		MyOrder_Amountclick.click();
	}
	
	//--------------------------ASSERT METHODS-------------------------------------------------------------------------
//
//	public boolean MyOrder_Lable() {
//		boolean MyOrder_Lable=MyOrder_LableElement.isDisplayed();
//		return MyOrder_Lable;		
//	}	
//		public boolean MyOrder_IDLable() {
//			boolean MyOrder_IDLable=MyOrder_ID_Lable.isDisplayed();
//			return MyOrder_IDLable;
//	}
}
