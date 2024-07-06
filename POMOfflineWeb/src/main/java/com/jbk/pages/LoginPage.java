package com.jbk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepo.LoginPageObjectRepo;

public class LoginPage extends LoginPageObjectRepo{
	

	WebDriver driver;
	/*
	@FindBy(id="email")
	public WebElement email;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(xpath="//button")
	public WebElement button;
	*/
	
	
	
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

		
	}
	
	
	public Dashboardpage loaddashboardpage(WebDriver driver){
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		button.click();
		return new Dashboardpage(driver);
	}


	public boolean checkCorrected(){
		
		
	//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	  email.sendKeys("kiran@gmail.com");
	
    // driver.findElement(By.id("password")).sendKeys("123456");
     	password.sendKeys("123456");
	
      //driver.findElement(By.xpath("//button")).click();
	   button.click();
	


   String actTitle=driver.getTitle();
   String expTitle="JavaByKiran | Dashboard";
 
     if (actTitle.equals(expTitle)) {
	System.out.println("title is matched");
	
	
	return true;
	
}
else {
	System.out.println("title is not matched");

   return false;

}





	}
	
	
	
	
	
	
	
	
	
	
	

}
