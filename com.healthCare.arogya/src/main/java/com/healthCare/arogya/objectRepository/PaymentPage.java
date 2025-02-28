package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PaymentPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public PaymentPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/pAddressPayment")
	private WebElement addressTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/ppNumberPayment")
	private WebElement contactNoTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/doctorpaybtn")
	private WebElement paynowBtn;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getAddressTxt() {
		return addressTxt;
	}

	public WebElement getContactNoTxt() {
		return contactNoTxt;
	}

	public WebElement getPaynowBtn() {
		return paynowBtn;
	}
	
	public void payment() throws Throwable
	{
		String address = elib.getDatafromExcelfle("PaymentPage", 1, 1);  //"Banglore";
		String contactNo = elib.getDatafromExcelfle("PaymentPage", 1, 2)+jlib.getRandomNumber(); //"1234567890";
		
		addressTxt.sendKeys(address);
		contactNoTxt.sendKeys(contactNo);
		paynowBtn.click();
	}
	

}
