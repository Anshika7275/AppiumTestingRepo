package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RemedyPaymentDetailsPage extends BaseClassUtility
{
	AppiumDriver driver;
	public RemedyPaymentDetailsPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/pcardNo")
	private WebElement cardNotxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/pexpireDate")
	private WebElement expDateTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/ppcvv")
	private WebElement ccvTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/ppayBtn")
	private WebElement payBtn;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getCardNotxt() {
		return cardNotxt;
	}

	public WebElement getExpDateTxt() {
		return expDateTxt;
	}

	public WebElement getCcvTxt() {
		return ccvTxt;
	}

	public WebElement getPayBtn() {
		return payBtn;
	}

	public void premedyPaymentDetails() throws Throwable
	{
		String cardNo = elib.getDatafromExcelfle("Paymentdetails", 1, 1); //"1234567887654321";
		String expDate = elib.getDatafromExcelfle("Paymentdetails", 1, 2); //"11/26";
		String cvv =  elib.getDatafromExcelfle("Paymentdetails", 1, 3); //"345";
		
		cardNotxt.sendKeys(cardNo);
		expDateTxt.sendKeys(expDate);
		ccvTxt.sendKeys(cvv);
		
		payBtn.click();
	}
	
}
