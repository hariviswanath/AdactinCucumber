package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\feature",
glue = "com.adactin.stepdefinition")

public class RunnerClass {
	
	public static WebDriver driver;
	
 @BeforeClass
	public static void setUp() {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\AdactinCucumber\\driver\\chromedriver.exe");
  
  driver = new ChromeDriver();
  
  driver.manage().window().maximize(); 
  
	}
 @AfterClass
 public static void tearDown() {
driver.close();
}
}
