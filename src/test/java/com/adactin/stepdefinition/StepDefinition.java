package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	
	
     public static WebDriver driver= RunnerClass.driver;
     
	 
	@Given("^User Luanch the web Application$")
	public void user_Luanch_the_web_Application() throws Throwable {
	 driver.get("https://adactinhotelapp.com/");
	}

	@When("^User Enter The Username in Username Field$")
	public void user_Enter_The_Username_in_Username_Field() throws Throwable {
      WebElement username = driver.findElement(By.id("username"));
      username.sendKeys("hari098hari");
	}

	@When("^User Enter The Password in Password Field$")
	public void user_Enter_The_Password_in_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sandhya@123");
	   
	}

	@Then("^user Click The Login Button Navigates sear Hotel Page$")
	public void user_Click_The_Login_Button_Navigates_sear_Hotel_Page() throws Throwable {
	    WebElement login = driver.findElement(By.id("login"));
	    login.click();
	}
}