package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public RegisterPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.example.ayurveda:id/signupbtn")
	private WebElement signUpBtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/uname")
	private WebElement userNameTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/uemail")
	private WebElement emailTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/upassword")
	private WebElement passwordTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/urepassword")
	private WebElement confirmPasswordTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/userregisterbtn")
	private WebElement registerBtn;
		
	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getUserNameTxt() {
		return userNameTxt;
	}

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getConfirmPasswordTxt() {
		return confirmPasswordTxt;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}
	
	public void registerToApp(String username, String email, String password, String confirmPassword)
	{
		signUpBtn.click();
		userNameTxt.sendKeys(username);
		emailTxt.sendKeys(email);
		passwordTxt.sendKeys(password);
		confirmPasswordTxt.sendKeys(confirmPassword);
		registerBtn.click();
	}
}
