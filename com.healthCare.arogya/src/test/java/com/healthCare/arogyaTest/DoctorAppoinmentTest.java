package com.healthCare.arogyaTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.healthCare.arogya.genericUtility.BaseClassUtility;
import com.healthCare.arogya.objectRepository.BookingDrVinayPage;
import com.healthCare.arogya.objectRepository.BookingNoPage;
import com.healthCare.arogya.objectRepository.DoctorHomePage;
import com.healthCare.arogya.objectRepository.DoctorLoginPage;
import com.healthCare.arogya.objectRepository.DrVinayPage;
import com.healthCare.arogya.objectRepository.HomePage;
import com.healthCare.arogya.objectRepository.PaymentDetailsPage;
import com.healthCare.arogya.objectRepository.PaymentPage;

public class DoctorAppoinmentTest extends BaseClassUtility{
	
	@Test
	public void checkAppoinmentTest() throws Throwable {
		
		/*Navigate to doctor link*/
		HomePage hp = new HomePage(driver);
		hp.getDrVinayOption().click();
		
		/*Click on appointment link*/
		DrVinayPage dvp = new DrVinayPage(driver);
		dvp.getBookNowBtn().click();
		
		/*Enter mandatory details*/
		BookingDrVinayPage bvp = new BookingDrVinayPage(driver);
		bvp.addDate();
		bvp.addTime();
		bvp.getBookBtn().click();
		
		/*click on payment option*/
		PaymentPage pp = new PaymentPage(driver);
		pp.payment();
		
		/*Enter payment details*/
		PaymentDetailsPage ppd = new PaymentDetailsPage(driver);
		ppd.paymentDetails();
		
		/*Capture Booking details and msg*/
		BookingNoPage bnp = new BookingNoPage(driver);
		String bookinNoTxt = bnp.getBookinNo().getText();
		
		String msgTxt = bnp.getMsg().getText();
		
		/*Assertion*/
		String expectedMsg = "Payement successfully!";
		boolean actTxt = msgTxt.contains(expectedMsg);
	
		Assert.assertEquals(actTxt, true);
		
		String headerBookingtxt = bnp.getHeaderBookingmsg().getText();
		boolean actBookingNo = headerBookingtxt.contains(bookinNoTxt);
		
		Assert.assertEquals(actBookingNo, true);
		
	}
	
	@Test
	public void checkPatientAppoinment()
	{
		DoctorLoginPage dlp = new DoctorLoginPage(driver);
		dlp.getDocEmailTxt().sendKeys("Vinay@gmail.com");
		dlp.getDocPasswordTxt().sendKeys("123456");
		
		DoctorHomePage dhP = new DoctorHomePage(driver);
		dhP.getAppointmentBtn().click();
	}
	
	
}
