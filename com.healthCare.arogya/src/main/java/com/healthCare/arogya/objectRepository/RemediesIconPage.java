package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RemediesIconPage {
	
	AppiumDriver driver;
	public RemediesIconPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/remediesbtn")
	private WebElement remediesBtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/goRemedyProfile")
	private WebElement navigateSymbol;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getRemediesBtn() {
		return remediesBtn;
	}

	public WebElement getNavigateSymbol() {
		return navigateSymbol;
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/doctorsbtn")
	private WebElement doctorBtn;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"TODO\"])[2]")
	private WebElement drHariNavigateBtn;
	
	public WebElement getDoctorBtn() {
		return doctorBtn;
	}

	public WebElement getDrHariNavigateBtn() {
		return drHariNavigateBtn;
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/herbsbtn")
	private WebElement herbsBtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/addcartbtn")
	private WebElement addToCartBtn;
	
	public WebElement getHerbsBtn() {
		return herbsBtn;
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}
}