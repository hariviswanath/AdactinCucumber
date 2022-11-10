package com.runnerclass10am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass10am.BaseClass;

public class RunnerClass extends BaseClass{
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=browserLaunch("chrome");
		
		//System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
	//	WebDriver driver = new ChromeDriver();
		
		//driver.get("https://adactinhotelapp.com/");
		
		driver=getUrl("https://adactinhotelapp.com/");
		
	//	driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		 //username.sendKeys("hari987hari");
		inputValueElement(username,"hari987hari");
		
		 WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("sandhya@123");
		inputValueElement(password, "sandhya@123");
		 
		WebElement login = driver.findElement(By.id("login"));
		//login.click();
		clickOnElement(login);
	}

}
