package com.healthCare.arogyaTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.healthCare.arogya.genericUtility.BaseClassUtility;
import com.healthCare.arogya.objectRepository.DrHariPage;
import com.healthCare.arogya.objectRepository.HomePage;
import com.healthCare.arogya.objectRepository.LocationPage;
import com.healthCare.arogya.objectRepository.RemediesIconPage;

public class PersonalizedRecommendationsTest extends BaseClassUtility{
	
	@Test
	public void personalizedRecommendationsTest()
	{
		HomePage hp = new HomePage(driver);
		hp.getRemedyOption().click();
		
		RemediesIconPage rip = new RemediesIconPage(driver);
		rip.getDrHariNavigateBtn().click();
		
		DrHariPage drp = new DrHariPage(driver);
		drp.getLocationlink().click();
		
		LocationPage lp = new LocationPage(driver);
		WebElement element = lp.getElement();
		
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.90));
		
		lp.getElement().click();
		
	}

}
