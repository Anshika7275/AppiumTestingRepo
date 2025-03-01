package com.healthCare.arogya.patientTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.testng.annotations.Test;

import com.healthCare.arogya.genericUtility.BaseClassUtility;
import com.healthCare.arogya.objectRepository.HomePage;
import com.healthCare.arogya.objectRepository.LoginPage;
import com.healthCare.arogya.objectRepository.RegisterPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class RegisterToAppTest extends BaseClassUtility{
	
	@Test
	public void registerToAppTest() throws Throwable
	{	
		String USERNAME = elib.getDatafromExcelfle("Register", 1, 1);
		String EMAIL = jlib.getRandomNumber()+elib.getDatafromExcelfle("Register", 1, 2);
		String PASSWORD = elib.getDatafromExcelfle("Register", 1, 3)+jlib.getRandomNumber();
		String CPASSWORD = elib.getDatafromExcelfle("Register", 1, 4)+jlib.getRandomNumber();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.registerToApp(USERNAME, EMAIL, PASSWORD, CPASSWORD);	
		
		HomePage hp = new HomePage(driver);
		hp.logoutFromApp();
		
		String LOGINEMAIL = EMAIL;
		String LOGINPASSWORD = PASSWORD;
		
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(LOGINEMAIL, LOGINPASSWORD);
		System.out.println("Successfully login to application!");
	}

}
