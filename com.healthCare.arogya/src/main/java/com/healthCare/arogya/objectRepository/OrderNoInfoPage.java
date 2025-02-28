package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrderNoInfoPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public OrderNoInfoPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/orderrefno")
	private WebElement orderNoheadertxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/suborderrefno")
	private WebElement subOrderNoTxt;
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getOrderNoheadertxt() {
		return orderNoheadertxt;
	}

	public WebElement getSubOrderNoTxt() {
		return subOrderNoTxt;
	}
	
	

}
