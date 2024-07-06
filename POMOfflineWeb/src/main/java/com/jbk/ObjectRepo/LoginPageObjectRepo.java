package com.jbk.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectRepo {
	
	
	
	
	@FindBy(id="email")
	public WebElement email;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(xpath="//button")
	public WebElement button;
	

	
	
	

}
