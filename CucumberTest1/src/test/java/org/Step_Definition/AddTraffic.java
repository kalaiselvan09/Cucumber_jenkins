package org.Step_Definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTraffic {


	@Given("the user navigate to add customer page")
	public void the_user_navigate_to_add_customer_page() {
		
		Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user fill in the valid details{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_the_valid_details(String Monrent, String FreeLocmin, String FreeIntmin, String FreeSms,
			String LMincharge, String IMinccharge, String Sms) {
		Hooks.driver.findElement(By.id("rental1")).sendKeys(Monrent);
		Hooks.driver.findElement(By.id("local_minutes")).sendKeys(FreeLocmin);
		Hooks.driver.findElement(By.id("inter_minutes")).sendKeys(FreeIntmin);
		Hooks.driver.findElement(By.id("sms_pack")).sendKeys(FreeSms);
		Hooks.driver.findElement(By.id("minutes_charges")).sendKeys(LMincharge);
		Hooks.driver.findElement(By.id("inter_charges")).sendKeys(IMinccharge);
		Hooks.driver.findElement(By.id("sms_charges")).sendKeys(Sms);

	}

	@When("The User Click on Submit Buttons")
	public void the_User_Click_on_Submit_Buttons() {
		Hooks.driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("The user see the congradulation message")
	public void the_user_see_the_congradulation_message() {
		Assert.assertTrue(
				Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

}
