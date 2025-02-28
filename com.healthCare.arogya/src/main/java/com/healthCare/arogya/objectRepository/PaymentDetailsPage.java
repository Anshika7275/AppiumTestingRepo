package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.apache.poi.ss.formula.functions.FinanceLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PaymentDetailsPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public PaymentDetailsPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/cardNo")
	private WebElement cardNoTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/expireDate")
	private WebElement expDateTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/cvv")
	private WebElement cvvTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/paymentGatewaybtn")
	private WebElement payBtn;
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getCardNoTxt() {
		return cardNoTxt;
	}

	public WebElement getExpDateTxt() {
		return expDateTxt;
	}

	public WebElement getCvvTxt() {
		return cvvTxt;
	}

	public WebElement getPayBtn() {
		return payBtn;
	}
	
	public void paymentDetails() throws Throwable
	{
		String cardNo = elib.getDatafromExcelfle("Paymentdetails", 1, 1); //"1234567887654321";
		String expDate = elib.getDatafromExcelfle("Paymentdetails", 1, 2); //"11/26";
		String cvv =  elib.getDatafromExcelfle("Paymentdetails", 1, 3); //"345";
		
		cardNoTxt.sendKeys(cardNo);
		expDateTxt.sendKeys(expDate);
		cvvTxt.sendKeys(cvv);
		
		payBtn.click();
	}

}
