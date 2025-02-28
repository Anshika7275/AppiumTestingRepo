package com.healthCare.arogya.doctorTest;

import org.testng.annotations.Test;

import com.healthCare.arogya.genericUtility.BaseClassUtility;
import com.healthCare.arogya.objectRepository.DoctorHomePage;
import com.healthCare.arogya.objectRepository.DoctorLoginPage;
import com.healthCare.arogya.objectRepository.DoctorSignUpPage;
import com.healthCare.arogya.objectRepository.LoginPage;

public class RegisterToDoctorText extends BaseClassUtility {
	
	@Test
	public void registerTest() throws Throwable
	{
		String userName = elib.getDatafromExcelfle("DoctorLogin", 1, 1);
		String email = elib.getDatafromExcelfle("DoctorLogin", 1, 2);
		String slmcrNo = elib.getDatafromExcelfle("DoctorLogin", 1, 3);
		String specialization = elib.getDatafromExcelfle("DoctorLogin", 1, 4);
		String password = elib.getDatafromExcelfle("DoctorLogin", 1, 5);
		String docPassword = elib.getDatafromExcelfle("DoctorLogin", 1, 6);
		
		LoginPage lp = new LoginPage(driver);
		lp.getDoctorLink().click();
		
		DoctorLoginPage dlp = new DoctorLoginPage(driver);
		dlp.getSignUpLink().click();
		
		DoctorSignUpPage dsp = new DoctorSignUpPage(driver);
		dsp.getDocUserNameTxt().sendKeys(userName);
		dsp.getDocEmailTxt().sendKeys(email);
		dsp.getSlmcregTxt().sendKeys(slmcrNo);
		dsp.getSpecializationTxt().sendKeys(specialization);
		dsp.getDocPasswordTxt().sendKeys(password);
		dsp.getDocConfirmPasswordTxt().sendKeys(docPassword);
		
		DoctorHomePage dhp = new DoctorHomePage(driver);
		dhp.getDocLogoutBtn();
		
		dlp.getDocEmailTxt().sendKeys(email);
		dlp.getDocPasswordTxt().sendKeys(password);
	}

}
