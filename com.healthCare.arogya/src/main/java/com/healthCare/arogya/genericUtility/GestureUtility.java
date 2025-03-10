package com.healthCare.arogya.genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
	
AndroidDriver driver;
	
	public GestureUtility(AndroidDriver driver) {
		this.driver=driver;
		
	}
	
	public void click(WebElement element) {
		((JavascriptExecutor)driver).executeScript("mobile:clickGesture",ImmutableMap.of 
		("elementId",((RemoteWebElement)element).getId()
		));
		
	}
	
	public void longClick(WebElement element) {
		((JavascriptExecutor)driver).executeScript("mobile:longClickGesture", ImmutableMap.of
		("elementId",((RemoteWebElement)element).getId(),"duration", 2000));
		
	}
	
	public void doubleClick(WebElement element) {
		((JavascriptExecutor)driver).executeScript("mobile:doubleClickGesture", ImmutableMap.of
		("elementId",((RemoteWebElement)element).getId()
		));
		
	}
	
	public void zoomIn(WebElement element, double percentage) {
		((JavascriptExecutor)driver).executeScript("mobile:pinchOpenGesture", ImmutableMap.of
		("elementId",((RemoteWebElement)element).getId(),"percent",percentage
		));
	}
	
	public void zoomOut(WebElement element, double percentage) {
		((JavascriptExecutor)driver).executeScript("mobile:pinchCloseGesture", ImmutableMap.of
		("elementId",((RemoteWebElement)element).getId(),"percent",percentage
		));
		
	}
	
	public void swipe(double percentage, int left, int top, int height, int width, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of
			("left", left, "top", top, "width", width, "height", height,
			    "direction", direction,"percent", percentage
			));
		
	}
	
	public void dragAndDrop(WebElement element,int x, int y) {
		((JavascriptExecutor)driver).executeScript("mobile:dragGesture", ImmutableMap.of
		("elementId",((RemoteWebElement)element).getId(),"endX",x,"endY",y));
		
	}
	
	public void scrollToText(String value) {
		driver.findElement(AppiumBy.androidUIAutomator
		("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+value+"\"));"));
		
	}
	
	public void scrollToId(String id) {
		driver.findElement(AppiumBy.androidUIAutomator
		("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView"
				+ "(new UiSelector().resourceIdMatches(\"" + id + "\"));"));
	}
	
	public void scrollByCordinates(int left, int top, int width, int height, String direction, double percent ) {
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", 
		ImmutableMap.of("left", left, "top", top, "width", width, "height", height,"direction", direction,
			    "percent", percent
			));
	}
	
	public void searchAction() {
		driver.executeScript("mobile: performEditorAction",
				ImmutableMap.of("action", "search"));
		
	}

}
