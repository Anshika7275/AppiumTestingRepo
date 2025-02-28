package com.healthCare.arogya.genericUtility;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.healthCare.arogya.objectRepository.HomePage;
import com.healthCare.arogya.objectRepository.LoginPage;
import com.healthCare.arogya.objectRepository.RegisterPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClassUtility {
	
	public AndroidDriver driver;
	static public AndroidDriver sdriver;
	public AppiumDriverLocalService service;
	
	public AndroidDriverUtility adlib;
	public GestureUtility glib;
	public JavaUtility jlib = new JavaUtility();
	public FileUtility flib = new FileUtility();
	public ExcelUtility elib = new ExcelUtility(); 

	@BeforeSuite
	public void startServer() {
	
		System.out.println("Appium server started!!!!");
		
//		File file = new File("C:\\Users\\anshi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
//		service = new AppiumServiceBuilder().withAppiumJS(file).withIPAddress("127.0.0.1").usingPort(4723)
//				.withTimeout(Duration.ofSeconds(200)).build();
//
//		service.start();
//		
//		System.out.println("App install successfully!!!");
//		
//		//driver.installApp("E:\\Anshika\\NOTES\\Mobile Testing\\app-release.apk");
	}
	
	@BeforeClass
	public void startApp() throws Throwable {
		
		System.out.println("Added desired capability!!!!");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		String platform = flib.dataFromPropertyFile("PLATFORM_NAME");
		String automationName = flib.dataFromPropertyFile("AUTOMATION_NAME");
		String device = flib.dataFromPropertyFile("DEVICE_NAME");
		String UDID = flib.dataFromPropertyFile("UDID");
		String policyError = flib.dataFromPropertyFile("API_POLICY_ERROR");
		String noRest = flib.dataFromPropertyFile("NO_REST");
		String permission = flib.dataFromPropertyFile("GRANT_PERMISSION");

		dc.setCapability("platformName", platform);
		dc.setCapability("automationName", automationName);
		dc.setCapability("deviceName", device);
		dc.setCapability("UDID", UDID);
		
		dc.setCapability("noReset", noRest);
		dc.setCapability("ignoreHiddenApiPolicyError", policyError);
		dc.setCapability("autoGrantPermissions", permission);
		
		URL u = new URL("http://localhost:4723");
		driver = new AndroidDriver(u,dc);

		driver.activateApp("com.example.ayurveda");
		System.out.println("App Opened successfully!!!!");

		sdriver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		glib = new GestureUtility(driver);
		adlib = new AndroidDriverUtility(driver);
	}
	
	@BeforeMethod
	public void login() throws Throwable {
		String USERNAME = elib.getDatafromExcelfle("Register", 1, 1);
		String EMAIL = jlib.getRandomNumber()+elib.getDatafromExcelfle("Register", 1, 2);
		String PASSWORD = elib.getDatafromExcelfle("Register", 1, 3)+jlib.getRandomNumber();
		String CPASSWORD = elib.getDatafromExcelfle("Register", 1, 4)+jlib.getRandomNumber();
		
//		System.out.println("Successfully register to application!!!!");
		
//		RegisterPage rp = new RegisterPage(driver);
//		rp.registerToApp(USERNAME, EMAIL, PASSWORD, CPASSWORD);
		
//		String LOGINEMAIL = elib.getDatafromExcelfle("Login", 1, 1);
//		String LOGINPASSWORD = elib.getDatafromExcelfle("Login", 1, 2);
//		
//		LoginPage lp = new LoginPage(driver);
//		lp.loginToApp(LOGINEMAIL, LOGINPASSWORD);
//		System.out.println("Successfully login to application!");
	}
	
	@AfterMethod
	public void closeApp() throws Throwable {
		
		
//		HomePage hp = new HomePage(driver);
//		hp.logoutFromApp();
//		System.out.println("Logout from app successfully!!!");
//		
//		driver.terminateApp("com.example.ayurveda");
//		System.out.println("Application closed successfully!!!!");
	}
	
	@AfterClass
	public void uninstall() throws Throwable {
		
		//String packageName = flib.dataFromPropertyFile("APP_PACKAGE");
		//driver.removeApp("com.example.ayurveda");
		System.out.println("Application Uninstall Successfully!!!");
	}
	
	@AfterSuite
	public void stopServer() {
		
//		service.stop();
		
		System.out.println("Server stoped successfully!!!!");
	}

}
