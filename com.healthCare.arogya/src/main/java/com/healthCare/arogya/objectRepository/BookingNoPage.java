package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BookingNoPage {
	
	AppiumDriver driver;
	public BookingNoPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	@AndroidFindBy(id = "com.example.ayurveda:id/userName9")
	private WebElement msg;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/subbookingrefno")
	private WebElement bookinNo;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getBookinNo() {
		return bookinNo;
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/bookingrefno")
	private WebElement headerBookingmsg;
	
	public WebElement getHeaderBookingmsg() {
		return headerBookingmsg;
	}
	
	
}
