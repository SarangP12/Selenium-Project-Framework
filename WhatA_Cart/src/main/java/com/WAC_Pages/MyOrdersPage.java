package com.WAC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {

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
	
	@FindBy(xpath = "//a[text()=\"Date Added\"]")
	WebElement MyOrder_Datesclick;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[5]/a")
	WebElement MyOrder_Viewclick;
	
	@FindBy(xpath = "//a[text()=\"General\"]")
	WebElement MyOrderView_generalclick;
	
	@FindBy(xpath = "//a[text()=\"Billing Address\"]")
	WebElement MyOrderView_BillingAdressclick;
	
	@FindBy(xpath = "//a[text()=\"Shipping Address\"]")
	WebElement MyOrderView_ShippingAdressclick;
	
	@FindBy(xpath = "//a[text()=\"Payment Details\"]")
	WebElement MyOrderView_Paymentclick;
	
	@FindBy(xpath = "//a[text()=\"Product Details\"]")
	WebElement MyOrderView_Productclick;

	@FindBy(xpath = "//a[text()=\"Order History\"]")
	WebElement MyOrderView_Historytclick;
	
	@FindBy(xpath = "//a[text()=\"Reviews(2)\"]")
	WebElement MyOrderView_Reviewclick;
	
	@FindBy(xpath = "//a[contains(@href,'/other/Wcart/catalog/products/site/detail?id=')]")
	WebElement MyOrderView_productTabLinkclick;
	
	
	

	//---------------------SENDKEY ELEMENT------------------------------------------
	@FindBy(xpath = "//input[@id=\"forgotpasswordform-email\"]")
	WebElement ForgotPass_EmailSendkey;

	
	//--------------------------BUTTON ELEMENT----------------------------------------------
	@FindBy(xpath = "//button[@id=\"save\"]")
	WebElement ForgotPass_SaveButton;
	
	@FindBy(xpath = "//a[@id=\"cancel-button\"]")
	WebElement ForgotPass_CancleButton;
	
	//--------------------------ASSERT ELEMENT-----------------------------------------
	@FindBy(xpath = "//h6[text()=\"My Orders\"]")
	WebElement MyOrder_LableElement;
	
	@FindBy(xpath = "//label[text()=\"Browse\"]")
	WebElement MyOrder_BrowsLableElement ;
	
	@FindBy(xpath = "//a[@class=\"sorting asc\"]")
	WebElement MyOrder_ID_Lable;
	
	@FindBy(xpath = "//a[@class=\"sorting asc\"][text()=\"Status\"]")
	WebElement MyOrder_Status_Lable;
	
	@FindBy(xpath = "//a[@class=\"sorting asc\"][text()=\"Amount\"]")
	WebElement MyOrder_Amount_Lable;
	
	@FindBy(xpath = "//a[@class=\"sorting asc\"][text()=\"Date Added\"]")
	WebElement MyOrder_Date_Lable;
	
	@FindBy(xpath = "//th[text()=\"Shipping\"]")
	WebElement MyOrderView_general_Lable;
	
	@FindBy(xpath = "//div[@id=\"tabbilling\"]//th[text()=\"Address\"]")
	WebElement MyOrderView_BillingAdress_Lable;
	
	@FindBy(xpath = "//div[@id=\"tabshipping\"]//th[text()=\"Address\"]")
	WebElement MyOrderView_ShipingAdress_Lable;
	
	@FindBy(xpath = "//div[@id=\"tabpayment\"]//th[text()=\"Net Payment\"]")
	WebElement MyOrderView_PaymentTab_Lable;
	
	@FindBy(xpath = "//div[@id=\"tabproducts\"]//strong[text()=\"Total\"]")
	WebElement MyOrderView_ProductTab_Lable;
	
	@FindBy(xpath = "//div[@id=\"tabhistory\"]//th[text()=\"Date Added\"]")
	WebElement MyOrderView_HistoryTab_Lable;
	
	@FindBy(xpath = "//a[text()=\"Description\"]")
	WebElement MyOrderView_Description_Lable;
	
	
	
	//---------------------------PAGE FACTORY INITIALIZATION---------------------------------------------------------------

	public MyOrdersPage(WebDriver driver) {
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
	public void MyOrder_Dates_click() {
		MyOrder_Datesclick.click();
	}
	public void MyOrder_View_click() {
		MyOrder_Viewclick.click();
	}
	public void MOView_Generalclick() {
		MyOrderView_generalclick.click();
	}
	public void MOView_BillingAdresslclick() {
		MyOrderView_BillingAdressclick.click();
	}
	public void MOView_ShipingAdresslclick() {
		MyOrderView_ShippingAdressclick.click();
	}
	public void MOView_Paymentlclick() {
		MyOrderView_Paymentclick.click();
	}
	public void MyOrderViewProductTab_click() {
		MyOrderView_Productclick.click();
	}
	public void MyOrderViewHistoryTab_click() {
		MyOrderView_Historytclick.click();
	}
	public void MyOrderViewProductTab_Linklclick() {
		MyOrderView_productTabLinkclick.click();
	}
	public void MyOrderViewProductTab_Reviewlclick() {
		MyOrderView_Reviewclick.click();
	}

	
	//--------------------------ASSERT METHODS-------------------------------------------------------------------------

	public boolean MyOrder_Lable() {
		boolean MyOrder_Lable=MyOrder_LableElement.isDisplayed();
		return MyOrder_Lable;		
	}	
		public boolean MyOrder_IDLable() {
			boolean MyOrder_IDLable=MyOrder_ID_Lable.isDisplayed();
			return MyOrder_IDLable;
	}
		public boolean MyOrder_StatusLable() {
			boolean MyOrder_StatusLable=MyOrder_Status_Lable.isDisplayed();
			return MyOrder_StatusLable;
	}
		public boolean MyOrder_AmountLable() {
			boolean MyOrder_AmountLable=MyOrder_Amount_Lable.isDisplayed();
			return MyOrder_AmountLable;
	}
		public boolean MyOrder_DateLable() {
			boolean MyOrder_DateLable=MyOrder_Date_Lable.isDisplayed();
			return MyOrder_DateLable;
	}
		public boolean MyOrderView_BrowsLable() {
			boolean MyOrder_BrowsLable=MyOrder_BrowsLableElement.isDisplayed();
			return MyOrder_BrowsLable;		
		}
		public boolean myOrderView_genaralLable() {
			boolean MyOrderView_genaralLable=MyOrderView_general_Lable.isDisplayed();
			return MyOrderView_genaralLable;		
		}	
		public boolean myOrderView_billingAddressLable() {
			boolean MyOrderView_billingAddressLable=MyOrderView_BillingAdress_Lable.isDisplayed();
			return MyOrderView_billingAddressLable;		
		}	
		public boolean myOrderView_ShippingAdressressLable() {
			boolean MyOrderView_ShippingAdressressLable=MyOrderView_ShipingAdress_Lable.isDisplayed();
			return MyOrderView_ShippingAdressressLable;		
		}
		public boolean myOrderView_PaymentTab() {
			boolean MyOrderView_PaymentTab=MyOrderView_PaymentTab_Lable.isDisplayed();
			return MyOrderView_PaymentTab;		
		}
		public boolean myOrderView_ProductTab() {
			boolean myOrderView_ProductTab=MyOrderView_ProductTab_Lable.isDisplayed();
			return myOrderView_ProductTab;		
		}
		public boolean myOrderView_HistoryTab() {
			boolean myOrderView_HistoryTab=MyOrderView_HistoryTab_Lable.isDisplayed();
			return myOrderView_HistoryTab;		
		}
		public boolean myOrderView_DescriptionTab() {
			boolean myOrderView_DescriptionTab=MyOrderView_Description_Lable.isDisplayed();
			return myOrderView_DescriptionTab;		
		}
		
}
