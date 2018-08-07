package com.cg.AmazonTest;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver = null;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\NewChromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^Open amazon\\.in site$")
	public void open_amazon_in_site() throws Throwable {
		driver.get("https://www.amazon.in/");
		
	}

	@When("^I add products to cart$")
	public void i_add_products_to_cart() throws Throwable {
		//add product1 -headphones
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("headphones");//serach
	   driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	   driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")).click();
	   driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	   Thread.sleep(500);
	   
	   //Product 2
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("tops for women");
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	   driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")).click();
	   driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  
	   Thread.sleep(500);
	   
	   //Product 3
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("perfumes for woman");
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	   driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")).click();
	   driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	   
	   Thread.sleep(500);
	   //Product 4
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("hair serum");
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	   driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")).click();
	   driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	   
	   /*String winHandleBefore=driver.getWindowHandle();
	   for(String winHandle : driver.getWindowHandles())
	   {
		   driver.switchTo().window(winHandle);
	   }
	   driver.close();
	   driver.switchTo().window(winHandleBefore);
	   driver.get("url of first page");
	  */
	}

	@Then("^products should be added to cart for payment$")
	public void products_should_be_added_to_cart_for_payment() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
		 String expected=driver.findElement(By.tagName("h1")).getText();		 
		 assertEquals(expected, "Login");
	}

}
