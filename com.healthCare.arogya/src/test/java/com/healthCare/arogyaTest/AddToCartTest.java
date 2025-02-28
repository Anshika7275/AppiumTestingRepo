package com.healthCare.arogyaTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.healthCare.arogya.genericUtility.BaseClassUtility;
import com.healthCare.arogya.objectRepository.BookingNoPage;
import com.healthCare.arogya.objectRepository.HomePage;
import com.healthCare.arogya.objectRepository.OrderNoInfoPage;
import com.healthCare.arogya.objectRepository.RemedyCartPage;
import com.healthCare.arogya.objectRepository.RemedyPage;
import com.healthCare.arogya.objectRepository.RemedyPaymentDetailsPage;
import com.healthCare.arogya.objectRepository.RemedyPaymentPage;
import com.healthCare.arogya.objectRepository.StorePage;

public class AddToCartTest extends BaseClassUtility{
	
	@Test
	public void addRemedyToCart() throws Throwable {
		
		HomePage hp = new HomePage(driver);
		hp.getStoreOption().click();
		
		StorePage sp = new StorePage(driver);
		sp.getAddSymbol().click();
		
		RemedyPage rp = new RemedyPage(driver);
		rp.getAddtocartBtn().click();
		
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
