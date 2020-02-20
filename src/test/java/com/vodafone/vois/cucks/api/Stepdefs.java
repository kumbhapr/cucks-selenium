package com.vodafone.vois.cucks.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	
	WebDriver driver;
	

	@Given("^I print hello message$")
	public void i_print_hello_message() throws Throwable {
	   System.out.println(" ----------------  Welcome to Cucumber Training  -------------");
	}
	

@Given("^Open the Chrome and launch the application$")
public void open_the_Firefox_and_launch_the_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver = new ChromeDriver();
    				
   // driver.manage().window().maximize();			
    	
}

@When("^Enter the Github URL$")
public void enter_the_Start_URL() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.get("https://github.com/login");
}

@Then("^We get Github page$")
public void we_get_Start_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
}


@When("^I enter credentials$")
public void i_enter_credentials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("login_field")).sendKeys("kumbhapr");
	 driver.findElement(By.id("password")).sendKeys("123456");	
}

@Then("^I click sign-in$")
public void i_get_github_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.name("commit")).click();
}



	
}
