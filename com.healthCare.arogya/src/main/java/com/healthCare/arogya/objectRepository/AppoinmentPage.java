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

public class AppoinmentPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public AppoinmentPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"TODO\"])[1]")
	private WebElement appinmentLInk;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/cardno")
	private WebElement cardNoTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/medication")
	private WebElement medicationTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/notes")
	private WebElement notesTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/diagSavebtn")
	private WebElement saveBtn;

	public WebElement getAppinmentLInk() {
		return appinmentLInk;
	}

	public WebElement getCardNoTxt() {
		return cardNoTxt;
	}

	public WebElement getMedicationTxt() {
		return medicationTxt;
	}

	public WebElement getNotesTxt() {
		return notesTxt;
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
}
