package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DoctorRemedyPage {
	
	AppiumDriver driver;
	public DoctorRemedyPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/titleRemedy")
	private WebElement titleRemedyTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/cateRemedy")
	private WebElement remedyDropDown;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/desRemedy")
	private WebElement remedyDesArea;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/addRemedybtn")
	private WebElement addBtn;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getTitleRemedyTxt() {
		return titleRemedyTxt;
	}

	public WebElement getRemedyDropDown() {
		return remedyDropDown;
	}

	public WebElement getRemedyDesArea() {
		return remedyDesArea;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}
	
	

}
