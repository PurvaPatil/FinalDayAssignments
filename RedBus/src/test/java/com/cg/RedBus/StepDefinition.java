package com.cg.RedBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver = null;
	RedBusPage page = null;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\NewChromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("^Open redbus\\.in site$")
	public void open_redbus_in_site() throws Throwable {
		// driver.get("");
		driver.get("https://www.redbus.in/");
	}

	@When("^I entered all required details$")
	public void i_entered_all_required_details() throws Throwable {
		page = PageFactory.initElements(driver, RedBusPage.class);
		page.source.sendKeys("Pune");
		page.destinition.sendKeys("Mumbai");

		page.date.click();
		page.onwardDate.click();

		Thread.sleep(500);
		page.sourceLink.click();
		Thread.sleep(500);
		page.destinitionLink.click();
		Thread.sleep(500);
		page.searchBuses.click();

		Thread.sleep(3000);
		page.viewSeats.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		page.boardingPoint.click();
		page.droppingPoint.click();

		Thread.sleep(500);
		page.proceed.click();
		

	}

	@Then("^I should book a seat and proceed for payment$")
	public void i_should_book_a_seat_and_proceed_for_payment() throws Throwable {

		page.name.sendKeys("Purva");
		page.age.sendKeys("29");
		page.gender.click();
		page.email.sendKeys("pp@gmail.com");
		page.phone.sendKeys("9876543211");
		page.terms.click();
		// page.wapp.click();
		page.proceedToPay.click();
	}

}
