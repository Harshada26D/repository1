package com.trueGlobal.testcase;

import org.testng.annotations.Test;

import TrueGlobal.TrueGlobal.Pageobjects;
import amazon.amazon.*;

public class filtertest1 extends BaseClass {
	@Test
	public void Test1()
	{
		driver.get(baseURL);
		
		//now we have to call the methods from pageobject for that we will create the object of that class
		
		Pageobjects po= new Pageobjects(driver);
		
		po.setSearch(searchbox);
		po.GoBtn();
		po.setBrand(brand);
		po.RedimiList();

		
	}}
