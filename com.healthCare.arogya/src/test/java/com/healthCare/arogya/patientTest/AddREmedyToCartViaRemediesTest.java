package com.healthCare.arogya.patientTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.healthCare.arogya.genericUtility.BaseClassUtility;
import com.healthCare.arogya.objectRepository.BookingNoPage;
import com.healthCare.arogya.objectRepository.HomePage;
import com.healthCare.arogya.objectRepository.OrderNoInfoPage;
import com.healthCare.arogya.objectRepository.RemediesIconPage;
import com.healthCare.arogya.objectRepository.RemedyCartPage;
import com.healthCare.arogya.objectRepository.RemedyPaymentDetailsPage;
import com.healthCare.arogya.objectRepository.RemedyPaymentPage;

public class AddREmedyToCartViaRemediesTest extends BaseClassUtility{
	
	@Test
	public void addREmedyToCartViaRemediesTest() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.getRemedyOption().click();
		
		hp.getRemedyOption().click();
		RemediesIconPage rip = new RemediesIconPage(driver);
		rip.getHerbsOption().click();
		rip.getAddToCartBtn().click();
		
		RemedyCartPage rcp = new RemedyCartPage(driver);
		rcp.getCheckOutBtn().click();
		
		/*Payment Mode*/
		RemedyPaymentPage rpp = new RemedyPaymentPage(driver);
		rpp.remedyPayment();
		
		/*Payment details*/
		RemedyPaymentDetailsPage rpd = new RemedyPaymentDetailsPage(driver);
		rpd.premedyPaymentDetails();
		
		/*Capture Booking deatils*/
		BookingNoPage bnp = new BookingNoPage(driver);
		String msgTxt = bnp.getMsg().getText();
		
		/*Assertion*/
		String expectedMsg = "Payement successfully!";
		boolean actTxt = msgTxt.contains(expectedMsg);
	
		Assert.assertEquals(actTxt, true);
		
		OrderNoInfoPage oip = new OrderNoInfoPage(driver);
		String suborderMsg = oip.getSubOrderNoTxt().getText();
		String orderNoHeaderMsg = oip.getOrderNoheadertxt().getText();
		boolean actOrderMsg = orderNoHeaderMsg.contains(suborderMsg);
		
		Assert.assertEquals(actOrderMsg, true);
	
	}

}
