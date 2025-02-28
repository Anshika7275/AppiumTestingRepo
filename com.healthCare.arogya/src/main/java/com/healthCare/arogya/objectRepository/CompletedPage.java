package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CompletedPage {
	
	AppiumDriver driver;
	public CompletedPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/textView20")
	private WebElement text;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/bookingNo")
	private WebElement headerTxt;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getHeaderTxt() {
		return headerTxt;
	}
}
