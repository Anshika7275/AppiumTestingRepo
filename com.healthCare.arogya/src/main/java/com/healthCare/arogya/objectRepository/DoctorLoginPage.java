package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DoctorLoginPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public DoctorLoginPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/ulemail")
	private WebElement docEmailTxt;          //vinay@gmail.com
	
	@AndroidFindBy(id = "com.example.ayurveda:id/ulpassword")
	private WebElement docPasswordTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/userlogoutbtn")
	private WebElement loginBtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/docsignupbtn")
	private WebElement signUpLink;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getDocEmailTxt() {
		return docEmailTxt;
	}

	public WebElement getDocPasswordTxt() {
		return docPasswordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getSignUpLink() {
		return signUpLink;
	}

	
	
}
