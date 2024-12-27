package com.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POMtestclass.Baseclass;

public class cartpage extends Baseclass{
	
	WebDriver driver ;

	//constructor
		public cartpage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements( driver , this);
		}
		
	//locators
		@FindBy (xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button") WebElement placeorder;
		@FindBy (xpath="//*[@id=\"navbarExample\"]/ul/li[4]/a") WebElement cart;
		@FindBy (id="name") WebElement name;
		@FindBy (id="country") WebElement country;
		@FindBy (id="city") WebElement city;
		@FindBy (id="card") WebElement card;
		@FindBy (id="month") WebElement month;
		@FindBy (id="year") WebElement year;
		@FindBy (xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]") WebElement purchase;
		@FindBy (xpath="/html/body/div[10]/div[7]/div/button") WebElement ok;
		@FindBy (xpath="/html/body/div[9]/p") WebElement details;
		
		//action methods
	
		public void clickPlaceorder() {
			placeorder.click();
			System.out.println("order placed successfully");
		}
		
		public void enterName(String Name) {
			name.sendKeys(Name);
		}
		
		public void enterCountry(String Country) {
			country.sendKeys(Country);
		}
		
		public void enterCity(String City) {
			city.sendKeys(City);
		}
		
		public void enterCard(String cardno) {
			card.sendKeys(cardno);
		}
		
		public void enterMonth(String Month) {
			month.sendKeys(Month);
		}
		
		public void enterYear(String Year) {
			year.sendKeys(Year);
		}
		
		public void clickPurchase() {
			purchase.click();
		}
		
		public void clickOk() {
			ok.click();
		}
		
		public void printdetails() {
			String dt =details.getText();
			System.out.println("Details of purchase are :" + dt);
		}

}
