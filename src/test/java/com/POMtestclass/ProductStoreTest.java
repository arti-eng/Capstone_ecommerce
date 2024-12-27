package com.POMtestclass;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductStoreTest extends Baseclass {
	
	@BeforeTest
	public void pagesetup() throws InterruptedException {
		hp.signUp("theee", "test13");
		hp.login("theee", "test13");
		Thread.sleep(4000);
		hp.buyaLaptop("Sony");
	}
	
	@Test (priority=1)
	
	public void addProductToCart() {
		pp.clickaddToCart();
		System.out.println("Product Added to cart successfully");
	}
	
	@Test (priority=2)
	
	public void openCart() throws InterruptedException {
		pp.clickOnCart();
		
	}
}
