package com.cg.RedBus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedBusPage {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"src\"]")
	WebElement source;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")
	WebElement sourceLink;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dest\"]")
	WebElement destinition;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")
	WebElement destinitionLink;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[3]/span")
	WebElement date;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[5]")
	WebElement onwardDate;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search_btn\"]")
	WebElement searchBuses;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"10021326\"]/div/div[2]/div[1]")
	WebElement viewSeats;

	@FindBy(how=How.XPATH,using="//*[@id=\"rt_10021326\"]/div/div/div/div[2]/div[2]/div[2]/div")
	WebElement seat1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"10021326\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]")
	WebElement boardingPoint;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"10021326\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]")
	WebElement droppingPoint;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"10021326\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")
	WebElement proceed;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-04\"]")
	WebElement name;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-01\"]")
	WebElement age;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"23_0\"]")
	WebElement gender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-05\"]")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-06\"]")
	WebElement phone;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")
	WebElement proceedToPay;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"whatsAppFeature\"]")
	WebElement wapp;	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div/label[1]/span[2]")
	WebElement terms;
}
