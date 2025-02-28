package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DoctorHomePage extends BaseClassUtility {
	
	AppiumDriver driver;
	public DoctorHomePage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/remedyNavBtn")
	private WebElement remedynavBtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/userAppointmentsbtn")
	private WebElement appointmentBtn;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getRemedynavBtn() {
		return remedynavBtn;
	}

	public WebElement getAppointmentBtn() {
		return appointmentBtn;
	}
	
	
			
}
