package com.baseclass10am;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver ; 
	
	public static WebDriver browserLaunch(String type) {
      if (type.equalsIgnoreCase("chrome")) {
    	
    	  System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
  		     driver = new ChromeDriver();
  		
	}
      else if (type.equalsIgnoreCase("firefox")) {
    	  System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
  		
         driver = new FirefoxDriver();
  		}
      driver.manage().window().maximize();
	return driver;
	}
	
	public static WebDriver getUrl(String url) {
      driver.get(url);
	return driver;
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	 public static void inputValueElement(WebElement element,String value) {
      element.sendKeys(value);
	}
	public static WebDriver close() {
     driver.close();
     return driver;
	}
	
	public static WebDriver quit() {
    driver.quit();
    return driver;
	}
	
}