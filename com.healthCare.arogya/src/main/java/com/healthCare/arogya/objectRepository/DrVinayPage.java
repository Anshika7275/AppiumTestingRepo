package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DrVinayPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public DrVinayPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/booknowbtndocprof")
	private WebElement bookNowBtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/mapbtn")
	private WebElement locationBtn;

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public WebElement getLocationBtn() {
		return locationBtn;
	}
	
	
}
