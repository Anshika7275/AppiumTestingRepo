package com.healthCare.arogya.doctorTest;

import org.testng.annotations.Test;

import com.healthCare.arogya.genericUtility.BaseClassUtility;
import com.healthCare.arogya.objectRepository.DoctorHomePage;
import com.healthCare.arogya.objectRepository.DoctorRemedyPage;

public class AddRemedyTest extends BaseClassUtility{
	
	@Test
	public void addRemedy()
	{
		DoctorHomePage dhp = new DoctorHomePage(driver);
		dhp.getRemedynavBtn().click();
		
		DoctorRemedyPage drp = new DoctorRemedyPage(driver);
		drp.getTitleRemedyTxt().sendKeys("");
		drp.getRemedyDropDown().sendKeys("");
		drp.getRemedyDesArea().sendKeys("");
		drp.getAddBtn().click();
		
	}

}
