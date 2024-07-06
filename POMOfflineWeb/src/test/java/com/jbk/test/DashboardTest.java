package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.base.BaseClass;
import com.jbk.pages.Dashboardpage;

public class DashboardTest extends BaseClass{
	
	
	WebDriver driver;
	
	Dashboardpage dashboardpage;
	
	
	@BeforeMethod
	
	public void setup() throws Exception {
		
		
		driver=initialization();
		
		dashboardpage=loadloginpage().loaddashboardpage(driver);
			
		
	}


	@Test
	
	public void Verifytitleuserpage(){
		
		Assert.assertTrue(dashboardpage.checkuserlink());
		
	}
	
	
	
	
	
	
	

}
