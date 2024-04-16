package com.coding.Allproduct;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

public class ProductORlayer {
	
	public ProductORlayer(KishanWebUtil kw)
	{
		PageFactory.initElements(kw.getDriver(), this);
	}
	
	

}
