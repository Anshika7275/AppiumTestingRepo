package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public LoginPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/ulemail")
	private WebElement emailTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/ulpassword")
	private WebElement passwordTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/userlogoutbtn")
	private WebElement loginBtn;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginToApp(String email, String password)
	{
		emailTxt.sendKeys(email);
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}

	
	@AndroidFindBy(id = "com.example.ayurveda:id/switchtoDoctorbtn")
	private WebElement doctorLink;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getDoctorLink() {
		return doctorLink;
	}
	
	
	
}
