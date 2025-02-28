package com.healthCare.arogya.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.healthCare.arogya.genericUtility.BaseClassUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BookingDrVinayPage extends BaseClassUtility{
	
	AppiumDriver driver;
	public BookingDrVinayPage(AndroidDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindAll({@AndroidBy(id = "com.example.ayurveda:id/datepickerbooking"), @AndroidBy(xpath = "//android.widget.EditText[@resource-id=\"com.example.ayurveda:id/datepickerbooking\"]")})
	private WebElement calanderWidget;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"25 February 2025\"]")
	private WebElement dateTxt;
	
	@AndroidFindBy(id = "android:id/button1")
	private WebElement okBtn;
	
	@AndroidFindBy(id = "android:id/next")
	private WebElement nextMonthbtn;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/timesspinner")
	private WebElement timeTxt;
	
	@AndroidFindBy(id = "com.example.ayurveda:id/doctorbookbtn")
	private WebElement bookBtn;
	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getCalanderWidget() {
		return calanderWidget;
	}

	public WebElement getDateTxt() {
		return dateTxt;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public WebElement getNextMonthbtn() {
		return nextMonthbtn;
	}

	public WebElement getTimeTxt() {
		return timeTxt;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}
	
	public void addDate() throws Throwable
	{
		calanderWidget.click();
		
		String date = elib.getDatafromExcelfle("ArogyaBooking", 1, 1);   //"27 February 2025";
		
		for(;;)
		{
			try {
				driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\""+date+"\"]")).click();
				okBtn.click();
				break;
			} catch (Exception e) {
				nextMonthbtn.click();
			}
		}
	}
	
	public void addTime() throws Throwable
	{
		String time = elib.getDatafromExcelfle("ArogyaBooking", 1, 2);   //"AM 10:30 - AM 11:00";
		timeTxt.click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\""+time+"\"]")).click();
	}

	

}
