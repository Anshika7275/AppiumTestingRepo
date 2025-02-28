package com.healthCare.arogya.genericUtility;

import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber()
	{
		Random random=new Random();
		int random_no = random.nextInt(2000);
		
		return random_no;
	}	

}
