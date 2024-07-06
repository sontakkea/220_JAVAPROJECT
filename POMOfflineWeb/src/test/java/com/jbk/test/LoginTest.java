package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.base.BaseClass;
import com.jbk.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	WebDriver driver;
	LoginPage lp;
	
	
	
	@BeforeMethod
	public void setUp() throws Exception{
		
		driver=initialization();
		
		
		lp = new LoginPage(driver);
		
		
		
           
		
		
			
	}
	
	@Test
	public void verifyTitledashboardpage(){
       Assert.assertTrue(lp.checkCorrected());



		
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
		
	}

}
