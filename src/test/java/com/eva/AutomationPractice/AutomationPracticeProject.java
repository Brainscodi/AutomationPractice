package com.eva.AutomationPractice;

import org.testng.annotations.Test;

import com.evs.practice.contactform.ContactUsPage;
import com.evs.vtiger.testScript.BaseClass;

public class AutomationPracticeProject extends BaseClass{
	
	@Test(enabled = true, invocationCount = 2)
	public void tc001ContactUs()
	{
		ContactUsPage cu	=new ContactUsPage(kw);
		cu.createcontactUsForm();
	}

}
