package com.coding.Allproduct;

import org.testng.Assert;

import com.evs.vtiger.utils.KishanWebUtil;

public class ProductClass extends ProductORlayer{
     private KishanWebUtil kc;
	public ProductClass(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}
	public String verifyhome()
	{
	String homepagetext=	kc.mygetText(gethomepage());
	return homepagetext;
	}
	
	public void verifytestfirstproduct()
	{kc.myclick(getClickonProduct());
	String actualAllProductvisible=	kc.mygetText(getAllproductText());
	Assert.assertEquals(actualAllProductvisible, "ALL PRODUCTS");
	kc.myclick(getclickOnViewProduct());
String Actualtitleproductlist=	kc.getTitle();
Assert.assertEquals(Actualtitleproductlist, "Automation Exercise - Product Details");
  kc.isDisplayed(getproductnamefirstgettext()); 
  kc.isDisplayed(getproductcategoryfirst());
  kc.isDisplayed(getproductpricefirst());
  kc.isDisplayed(getproductavailability());
  kc.isDisplayed(getproductcondition());
  kc.isDisplayed(getproductbrand());

	}
	
	public void verifysearchproduct()
	{
		kc.myclick(getClickonProduct());
		String actualAllProductvisible=	kc.mygetText(getAllproductText());
		Assert.assertEquals(actualAllProductvisible, "ALL PRODUCTS");
		kc.mySenkeys(getsearchproduct(), "Men Tshirt");
		kc.myclick(getclickonsearchButton());
		
		
	}

}
