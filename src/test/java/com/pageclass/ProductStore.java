package com.pageclass;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductStore {
	WebDriver driver ;

    //constructor
	public ProductStore(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements( driver , this);
	}
	
	//locators
	
	@FindBy (xpath="//*[@id=\"cartur\"]") WebElement cart;
	@FindBy (xpath ="//*[@id=\"tbodyid\"]/div[2]/div/a") WebElement addToCart;
	
	//action methods

	public void clickaddToCart() {
		addToCart.click();
	}
		
	public void clickOnCart() {
		cart.click();
	}

}
