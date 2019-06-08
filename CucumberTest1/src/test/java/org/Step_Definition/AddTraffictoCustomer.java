package org.Step_Definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddTraffictoCustomer {
	@Given("The user is in add Traffic plan to customer page")
	public void the_user_is_in_add_Traffic_plan_to_customer_page() {
		Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan to Customer']")).click();
		Hooks.driver.findElement(By.id("customer_id")).sendKeys("037217");
		Hooks.driver.findElement(By.name("submit")).click();
			
	}

	@When("To click Select Traiff plan radio button")
	public void to_click_Select_Traiff_plan_radio_button() {
	   //Hooks.driver.findElement(By.xpath("//label[@for='sele']")).click();
	}

	@When("Click the Add Traiff button to customer")
	public void click_the_Add_Traiff_button_to_customer() {
		  Hooks .driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("The Congratulation traffic plan assigned message generated")
	public void the_Congratulation_traffic_plan_assigned_message_generated() {
		  Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation Tariff Plan assigned']")).isDisplayed());
	}


}
