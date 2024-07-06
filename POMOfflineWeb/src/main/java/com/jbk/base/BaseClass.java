package com.jbk.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jbk.pages.LoginPage;

public class BaseClass {
	
	WebDriver driver = null;
	
	
	
	
	public String readproperty(String key) throws Exception{
		
		Properties prop= new Properties();
		
		String path=System.getProperty("user.dir")+"/src/main/resources/config.properties";
		
		
		FileInputStream fis= new FileInputStream(path);
		
		prop.load(fis);
		
		
		return prop.getProperty(key);
		
		
		
	}
	
	
	
	public void launchApplication() throws Exception{
		
	driver.get(readproperty("url"));
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	
	
	
		
		
		
	}
	
	
	
	public WebDriver initialization() throws Exception{
		
		if(readproperty("browser").equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			launchApplication();
			
			
			return driver;	
			
		}
	
		
	else {
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			WebDriver driver= new FirefoxDriver();
			
			launchApplication();
			return driver;
			
			
		}
		
	}
	
	
	public LoginPage loadloginpage(){
		
	LoginPage loginpage= new LoginPage(driver);
	
	return loginpage;
	
	}
	
	
	
	
	public static void main(String[] args) throws Exception {

	BaseClass bs= new BaseClass();
	
	System.out.println(bs.readproperty("url"));
	bs.initialization();
	
	
	
	
	}
	
	
	
	
	
	

}
