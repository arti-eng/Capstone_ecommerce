package com.POMtestclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.pageclass.Homepage;
import com.pageclass.ProductStore;
import com.pageclass.cartpage;

public class homePageTest extends Baseclass {


	@Test (priority=1)
	public void Test1() {
		String url= hp.getAppUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://www.demoblaze.com/","not matched");
		System.out.println("URL Matched" );	
	}

	@Test (priority=2)
	public void validateSignup() throws InterruptedException {
		hp.signUp("theee", "test13");
		System.out.println("SIGNUP SUCCESSFUL");
		
	}
	//	  
	@Test (priority=3)
	public void validateLogin() throws InterruptedException {
		hp.login("theee", "test13");
		System.out.println("LOGIN SUCCESSFUL");
		getScreenshot(driver, "AfterLogin");
	}
	//

	@Test (priority=4)

	public void validateNoOfOptions() {
		int total = hp.getTotalCategories();
		Assert.assertEquals(total, 3, "Not Same");
	}
	@Test (priority=5)
	public void validateListOfOptions() {
		hp.getTextOfCategories();	  
	}
	//  

	//  
	@Test (priority=6)

	public void gotoPhones() throws InterruptedException {
		addWait();
		hp.phonesProduct();
	}

	@Test (priority=7)

	public void getNoOfPhones() {
		hp.totalPhoneproducts();
	}

	@Test (priority=8)

	public void getlistOfPhones() {
		hp.listOfPhones();
	}
	
	@Test (priority=9)

	public void gotoMonitors() throws InterruptedException {
//		addWait();
		hp.monitorsProduct();
		System.out.println("Successfully clicked on monitors");
	}

	@Test (priority=10)

	public void getNoOfMonitors() {
		int total= hp.totalMonitorproducts();
		System.out.println("Totaol no of monitors are :" +total);
	}

	@Test (priority=11)

	public void getlistOfMonitors() {
		hp.listOfMonitors();
	}


	@Test (priority=12)

	public void gotoLaptops() throws InterruptedException {
	    addWait();
		hp.laptopsProduct();
	}

	@Test (priority=13)

	public void getNoOfLaptops() {
		int total= hp.totalLaptopsproducts();
		System.out.println("Total no of laptops are :" +total);
	}

	@Test (priority=14)

	public void getlistOfLaptops() {
		hp.listOfLaptops();
	}

	
	
	@Test(priority=15)
	public void toBuyALaptop() {
		hp.buyaLaptop("Sony");
		
	}
	
}
