package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DoctorSignUpPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public DoctorSignUpPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	private WebElement mapOption;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/uname")
	private WebElement docUserNameTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/uemail")
	private WebElement docEmailTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/slmcreg")
	private WebElement slmcregTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/specialization")
	private WebElement specializationTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/upassword")
	private WebElement docPasswordTxt;

	@AndroidFindBy(id = "com.example.ayurveda:id/urepassword")
	private WebElement docConfirmPasswordTxt;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getMapOption() {
		return mapOption;
	}

	public WebElement getDocUserNameTxt() {
		return docUserNameTxt;
	}

	public WebElement getDocEmailTxt() {
		return docEmailTxt;
	}

	public WebElement getSlmcregTxt() {
		return slmcregTxt;
	}

	public WebElement getSpecializationTxt() {
		return specializationTxt;
	}

	public WebElement getDocPasswordTxt() {
		return docPasswordTxt;
	}

	public WebElement getDocConfirmPasswordTxt() {
		return docConfirmPasswordTxt;
	}
	
	
}
