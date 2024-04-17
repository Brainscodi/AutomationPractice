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
	
	@FindBy(xpath = "//i[@class='fa fa-home']/parent::a")
	private WebElement homepagetext;
	public WebElement gethomepage()
	{
		return homepagetext;
	}
	
	@FindBy(xpath = "//a[@href=\"/products\"]")
	private WebElement clickonproduct;
	public WebElement getClickonProduct()
	{
		return clickonproduct;
	}
	
	@FindBy(xpath = "//h2[text()='All Products']")
	private WebElement allproducttext;
	public WebElement getAllproductText()
	{
		return allproducttext;
	}
	
	@FindBy(xpath = "//a[@href='/product_details/1']")
	private WebElement clickonviewProduct;
	public WebElement getclickOnViewProduct()
	{
		return clickonviewProduct;
	}
	
	@FindBy(xpath = "//h2[text()='Blue Top']")
	private WebElement productnamefirst;
	public WebElement getproductnamefirstgettext()
	{
		return productnamefirst;
	}
	
	@FindBy(xpath = "//p[text()='Category: Women > Tops']")
	private WebElement productcategoryfirst;
	public WebElement getproductcategoryfirst()
	{
		return productcategoryfirst;
	}
	@FindBy(xpath = "//span[text()='Rs. 500']")
	private WebElement productpricefirst;
	public WebElement getproductpricefirst()
	{
		return productpricefirst;
	}
	
	@FindBy(xpath = "//b[text()='Availability:']")
	private WebElement productavailability;
	public WebElement getproductavailability()
	{
		return productavailability;
	}
	
	@FindBy(xpath = "//b[text()='Condition:']")
	private WebElement productcondition;
	public WebElement getproductcondition()
	{
		return productcondition;
	}
	
	@FindBy(xpath = "//b[text()='Brand:']")
	private WebElement productbrand;
	public WebElement getproductbrand()
	{
		return productbrand;
	}
	
	@FindBy(id = "search_product")
	private WebElement searchproduct;
	public WebElement getsearchproduct()
	{
		return searchproduct;
	}
	
	@FindBy(id ="submit_search")
	private WebElement searchbutton;
	public WebElement getclickonsearchButton()
	{
		return searchbutton;
	}
	
	@FindBy(xpath = "//h2[text()='Searched Products']")
	private WebElement searchProductgext;
	public WebElement getsearchProductgext()
	{
		return searchProductgext;
	}
	
	
	

}
