package com.healthCare.arogya.doctorTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.healthCare.arogya.genericUtility.BaseClassUtility;
import com.healthCare.arogya.objectRepository.AppoinmentPage;
import com.healthCare.arogya.objectRepository.CompletedPage;
import com.healthCare.arogya.objectRepository.DoctorHomePage;

import io.appium.java_client.AppiumBy;

public class Test extends BaseClassUtility{
	
	@Test
	public void checkAppoinmentTest() throws Throwable
	{
		
		String cardNo = elib.getDatafromExcelfle("AppoinmantDetails", 1, 1);
		String medication = elib.getDatafromExcelfle("AppoinmantDetails", 1, 2);
		String notes = elib.getDatafromExcelfle("AppoinmantDetails", 1, 3);
		
		DoctorHomePage dhp = new DoctorHomePage(driver);
		dhp.getAppointmentBtn().click();
		
		AppoinmentPage ap = new AppoinmentPage(driver);
		ap.getAppinmentLInk().click();
		
		driver.findElement(AppiumBy.androidUIAutomator(new UiScrollable(new UiSelector()).scrollIntoView(text("\++\"))))
		
//		ap.getCardNoTxt().sendKeys(cardNo);
//		ap.getMedicationTxt().sendKeys(medication);
//		ap.getNotesTxt().sendKeys(notes);
//		
//		ap.getSaveBtn().click();
//		
//		CompletedPage cp = new CompletedPage(driver);
//		String txt = cp.getText().getText();
//		String headerTxt = cp.getHeaderTxt().getText();
//		
//		boolean actTxt = txt.contains(headerTxt);
//		Assert.assertEquals(actTxt, true);
	}

}
