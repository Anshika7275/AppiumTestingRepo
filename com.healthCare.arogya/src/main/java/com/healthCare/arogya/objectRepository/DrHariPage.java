package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DrHariPage {
	
	AppiumDriver driver;
	public DrHariPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/mapbtn")
	private WebElement locationlink;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/booknowbtndocprof")
	private WebElement bookNowBtn;

	public WebElement getLocationlink() {
		return locationlink;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	
	
}
