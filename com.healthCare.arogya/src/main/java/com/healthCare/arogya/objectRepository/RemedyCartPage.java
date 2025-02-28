package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RemedyCartPage {
	
	AppiumDriver driver;
	public RemedyCartPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/checkoutbtn")
	private WebElement checkOutBtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/qtyplus")
	private WebElement plusBtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/qtyminus")
	private WebElement minusBtn;
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}

	public WebElement getPlusBtn() {
		return plusBtn;
	}

	public WebElement getMinusBtn() {
		return minusBtn;
	}
	
	

}
