package com.eva.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class Registration_Login {
	private WebDriver driver=null;
	@Test()
	public void registration()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		String actualhomepagetitle=  driver.findElement(By.xpath("//i[@class='fa fa-home']/parent::a")).getText();
		Assert.assertEquals(actualhomepagetitle, "Home");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		String actualnewuserSignup=	driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();;
		Assert.assertEquals(actualnewuserSignup, "New User Signup!");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kishan");
		String random=	  new RandomString().make(2);
		driver.findElement(By.xpath("//input[@placeholder='Name']/following-sibling::input[@placeholder='Email Address']")).sendKeys("kishan@yopmail.com"+random);
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("Kishan@12345");
		WebElement days=  driver.findElement(By.id("days"));
		Select daydrop=   new Select(days);
		daydrop.selectByValue("5");
		WebElement months= driver.findElement(By.id("months"));
		Select monthsdrop=	new Select(months);
		monthsdrop.selectByValue("9");
		WebElement years=	driver.findElement(By.id("years"));
		Select yearsdrop=     new Select(years);
		yearsdrop.selectByValue("2001");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("Kishan");
		driver.findElement(By.id("last_name")).sendKeys("Dubey");
		driver.findElement(By.id("company")).sendKeys("codingbrains");
		driver.findElement(By.id("address1")).sendKeys("Kanpur");
		driver.findElement(By.id("address2")).sendKeys("Delhi");
		WebElement country=	driver.findElement(By.xpath("//select[@name='country']"));
		Select countrydrop=  new Select(country);
		countrydrop.selectByValue("India");
		driver.findElement(By.id("state")).sendKeys("UP");
		driver.findElement(By.id("city")).sendKeys("Lucknow");
		driver.findElement(By.id("zipcode")).sendKeys("221401");
		driver.findElement(By.id("mobile_number")).sendKeys("8585858585");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		String accountcreate=    driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
		Assert.assertEquals(accountcreate, "ACCOUNT CREATED!");
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		String loginkishan=  driver.findElement(By.xpath("//b[text()='Kishan']")).getText();
		Assert.assertEquals(loginkishan, "Kishan");
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
     String accountdelete=   driver.findElement(By.xpath("//b[text()='Account Deleted!']")).getText();
    Assert.assertEquals(accountdelete, "ACCOUNT DELETED!");


	}

}
