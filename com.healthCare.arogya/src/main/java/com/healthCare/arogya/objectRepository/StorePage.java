package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StorePage {
	
	AppiumDriver driver;
	public StorePage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/addcartbtn")
	private WebElement addSymbol;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/imageButton2")
	private WebElement addTocart;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getAddSymbol() {
		return addSymbol;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}
	
	

}
