package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BaseClassUtility{
	
	AppiumDriver driver;
	public HomePage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/letsgobtn")
	private WebElement letsGoBtn;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"TODO\"])[1]")
	private WebElement drVinayOption;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"TODO\"])[2]")
	private WebElement drHariOption;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/storenavbtn")
	private WebElement storeOption;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/userProfileNavbtn")
	private WebElement adminOption;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/remedyNavBtn")
	private WebElement remedyOption;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/userAppointmentsbtn")
	private WebElement appointmentOption;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/userlogout_btn")
	private WebElement logOutTxt;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getLetsGoBtn() {
		return letsGoBtn;
	}

	public WebElement getDrVinayOption() {
		return drVinayOption;
	}

	public WebElement getDrHariOption() {
		return drHariOption;
	}

	public WebElement getStoreOption() {
		return storeOption;
	}

	public WebElement getAdminOption() {
		return adminOption;
	}

	public WebElement getRemedyOption() {
		return remedyOption;
	}

	public WebElement getAppointmentOption() {
		return appointmentOption;
	}

	public WebElement getLogOutTxt() {
		return logOutTxt;
	}
	
	public void logoutFromApp()
	{
		adminOption.click();
		logOutTxt.click();
	}
	
}
