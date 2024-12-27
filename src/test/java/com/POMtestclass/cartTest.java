package com.POMtestclass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cartTest extends Baseclass{
	
	@BeforeTest
	public void pagesetup() throws InterruptedException {
		hp.signUp("theee", "test13");
		hp.login("theee", "test13");
		Thread.sleep(4000);
		hp.buyaLaptop("Sony");
		pp.clickaddToCart();
		pp.clickOnCart();
	}
	
	@Test (priority=1)
	public void placeAnOrder() {
		cp.clickPlaceorder();
		
	}
	
	@Test (priority=2)
	
	public void fillForm() throws InterruptedException {
		cp.enterName("Arti");
		cp.enterCountry("india");
		cp.enterCity("Bareilly");
		cp.enterCard("12132324");
		cp.enterMonth("December");
		cp.enterYear("2024");
		cp.clickPurchase();
		getScreenshot(driver,"ThankyouPopUp");
		cp.clickOk();
	
	}
	
	
	@Test (priority=3)
	public void detailsScreenshot() throws InterruptedException {
    Thread.sleep(3000);
	getScreenshot(driver,"alldetails");
	}

}
