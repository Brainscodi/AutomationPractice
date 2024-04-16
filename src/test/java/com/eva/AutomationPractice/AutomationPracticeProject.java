package com.eva.AutomationPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.evs.practice.contactform.ContactUsPage;
import com.evs.vtiger.commonCodes.CommonResuableCode;
import com.evs.vtiger.testScript.BaseClass;

public class AutomationPracticeProject extends BaseClass{
	public CommonResuableCode cd;
	@Test(enabled = true, invocationCount = 2)
	public void tc001ContactUs()
	{
		ContactUsPage cu	=new ContactUsPage(kw);
		cu.createcontactUsForm();
	}
	
//	@DataProvider
//	public Object [][] logindata()
//	{
//		return new Object [][] {
//			{"codingkishan@yopmail.com","Kishan@12345"},
//			{"codingkisn@yopmail.com","Kishan@1234"},
//			{"codingkishan@yopmail.com","Kishan@12345"},
//			{"codingkisn@yopil.com","Kishan@1234"},
//			{" "," "}
//		};
//	}
//	
//	
//	@Test(dataProvider = "logindata")
//	public void validlogin(String Username,String Password)
//	{
//		cd= new CommonResuableCode(kw);
//	    cd.validLogin(Username, Password);	
//	}

}
