package com.trueGlobal.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL="https://www.amazon.in";
	public String searchbox= "phone";
	public String brand= "Redmi";
	public String iphoneSrch ="iphone";
	public String price = "51999";
	
	public String email ="harshallother@gmail.com";
	public String passwordRegistration ="abcd12345";
	
public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}
