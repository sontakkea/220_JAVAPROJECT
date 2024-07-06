package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepo.DashboardpageobjectRepo;

public class Dashboardpage extends DashboardpageobjectRepo{
	
	WebDriver driver;
	
	
	public Dashboardpage(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	public boolean checkuserlink(){
		String exptitle= "JavaByKiran | Users";
		users.click();
		
		
		if(driver.getTitle().equals(exptitle))
		{
		   return true;	   
	}
	
		
		else{
			
		
			return false;
		}
	
	
	
	}
}
