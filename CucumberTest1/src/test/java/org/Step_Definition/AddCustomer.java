package org.Step_Definition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {

	

	@Given("he user is in Telecom home page")
	public void he_user_is_in_Telecom_home_page() {
		
	}

	@Given("The User click an add Customer")
	public void the_User_click_an_add_Customer() {
		Hooks.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The User is filling all the details{string},{string},{string},{string},{string}")
	public void the_User_is_filling_all_the_details(String FName, String LName, String Email, String Address,
			String Phone) {
		Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(FName);
		Hooks.driver.findElement(By.id("lname")).sendKeys(LName);
		Hooks.driver.findElement(By.id("email")).sendKeys(Email);
		Hooks.driver.findElement(By.name("addr")).sendKeys(Address);
		Hooks.driver.findElement(By.name("telephoneno")).sendKeys(Phone);
	}

	@When("The User Click on Submit Button")
	public void the_User_Click_on_Submit_Button() {
		Hooks.driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("The Customer Id Generated Sucessfully")
	public void the_Customer_Id_Generated_Sucessfully() {
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
		WebElement uname=Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		String cId = uname.getAttribute("value");
		System.out.println(cId);
		
	}
	
	@When("The User is invalid details to all the fields{string},{string},{string},{string},{string}")
	public void the_User_is_invalid_details_to_all_the_fields(String FName, String LName, String Email, String Address,
			String Phone) {
		Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(FName);
		Hooks.driver.findElement(By.id("lname")).sendKeys(LName);
		Hooks.driver.findElement(By.id("email")).sendKeys(Email);
		Hooks.driver.findElement(By.name("addr")).sendKeys(Address);
		Hooks.driver.findElement(By.name("telephoneno")).sendKeys(Phone);
	}
	

	@Then("The each filed error msg displayed")
	public void the_each_filed_error_msg_displayed() {
		WebElement uname=Hooks.driver.findElement(By.xpath("(//label[text()='Numbers are not allowed'])"));
		Assert.assertTrue(uname.isDisplayed());
	    
	}

}
