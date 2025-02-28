package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LocationPage {
	
	AppiumDriver driver;
	public LocationPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.example.ayurveda:id/map\"]/android.widget.FrameLayout/android.widget.RelativeLayout[2]")
	private WebElement element;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Get directions\"]")
	private WebElement directionIcon;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Open in Google Maps\"]")
	private WebElement mapIcon;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getElement() {
		return element;
	}
	
	public WebElement getDirectionIcon() {
		return directionIcon;
	}

	public WebElement getMapIcon() {
		return mapIcon;
	}
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Balachikitsa-(Pediatrics)\"]")
	private WebElement locationIcon;
	
	public WebElement getLocationIcon() {
		return locationIcon;
	}
	
	
	
}
