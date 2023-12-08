package com.trueGlobal.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TrueGlobal.TrueGlobal.iphonePageObject;

public class TC_iphone_01 extends BaseClass{
	@Test(priority=0)
	public void Test1()
	{
		driver.get(baseURL);
		
		iphonePageObject ipo = new iphonePageObject(driver);
		
		ipo.setSearch(iphoneSrch);
		ipo.suggestionlist();
		ipo.SelectIphone();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	   	js.executeScript("window.scrollBy(0,500)","");
		
		ipo.price(price);
		ipo.Checkbx();
		
		ipo.iphone13();
		ipo.getwindowhandle();
		

		
	System.out.println("In test 2");
   	js.executeScript("window.scrollBy(0,200)","");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='submit.add-to-cart'])[2]"))).click();
   	
   // ipo.Addtocart();
    ipo.ProceedToCheck();
      
      
	
		//ipo.SignIn();
		ipo.email(email);
		ipo.Continue();
		ipo.password2(passwordRegistration);
		ipo.SignInSubmit();
		
	}
}
