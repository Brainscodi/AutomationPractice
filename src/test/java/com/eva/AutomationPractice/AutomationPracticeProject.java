package com.eva.AutomationPractice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.coding.Allproduct.ProductClass;
import com.evs.practice.contactform.ContactUsPage;
import com.evs.vtiger.commonCodes.CommonResuableCode;
import com.evs.vtiger.testScript.BaseClass;
import com.evs.vtiger.testScript.RetryAnalyzer;

public class AutomationPracticeProject extends BaseClass{
	public CommonResuableCode cd;
	@Test(enabled = false, invocationCount = 2,retryAnalyzer = RetryAnalyzer.class)
	public void tc001ContactUs()
	{
		ContactUsPage cu	=new ContactUsPage(kw);
		cu.createcontactUsForm();
	}
	@Test(enabled = false,retryAnalyzer = RetryAnalyzer.class)
	public void projectAllList()
	{
	     ProductClass pc=  new ProductClass(kw);
	   String actualhomepagetext=  pc.verifyhome();
	   Assert.assertEquals(actualhomepagetext, "Home");
	   pc.verifytestfirstproduct();
	   
	}
	@Test
	public void verifysearchproduct()
	{
		 ProductClass pc=  new ProductClass(kw);
		  String actualhomepagetext=  pc.verifyhome();
		  Assert.assertEquals(actualhomepagetext, "Home");
		  pc.verifysearchproduct();
		
	
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
