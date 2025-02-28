package com.healthCare.arogyaTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class InstallAppTest {
	
	@Test
	public void installAppMethodTest() throws MalformedURLException
	{
		
		UiAutomator2Options op = new UiAutomator2Options();
		
		op.setPlatformName("android");
		op.setAutomationName("uiAutomator2");
		op.setDeviceName("Anshii");
		op.setCapability("UDID", "JBWODMBUYL6H9LHE");
	
		URL u= new URL("http://localhost:4723");
		
		AndroidDriver driver = new AndroidDriver(u,op);
		driver.installApp("E:\\Anshika\\NOTES\\Mobile Testing\\app-release.apk");
		
		boolean result = driver.isAppInstalled("com.example.ayurveda");
		System.out.println(result+"  means it's installed!!!");
		
	}
	
	@Test
	public void registerToAppTest() throws Throwable
	{	
		UiAutomator2Options op = new UiAutomator2Options();
		
		op.setPlatformName("android");
		op.setAutomationName("uiAutomator2");
		op.setDeviceName("Anshii");
		op.setCapability("UDID", "JBWODMBUYL6H9LHE");
	
		URL u= new URL("http://localhost:4723");
		
		AndroidDriver driver = new AndroidDriver(u,op);
		driver.activateApp("com.example.ayurveda");
		
		String email = new Random().nextInt(50)+"abc@gmail.com";
		
		driver.findElement(AppiumBy.id("com.example.ayurveda:id/signupbtn")).click();
		driver.findElement(AppiumBy.id("com.example.ayurveda:id/uname")).sendKeys("admin");
		driver.findElement(AppiumBy.id("com.example.ayurveda:id/uemail")).sendKeys(email);
		driver.findElement(AppiumBy.id("com.example.ayurveda:id/upassword")).sendKeys("admin");
		driver.findElement(AppiumBy.id("com.example.ayurveda:id/urepassword")).sendKeys("admin");
		driver.findElement(AppiumBy.className("android.widget.Button")).click();

		driver.findElement(AppiumBy.className("android.widget.ImageButton")).click();	
		
	}

}
