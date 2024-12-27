package com.POMtestclass;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

import com.pageclass.Homepage;
import com.pageclass.ProductStore;
import com.pageclass.cartpage;

public class Baseclass {

	public static WebDriver driver;
	public Homepage hp;
	public cartpage cp;
	public ProductStore pp;
	
	@BeforeTest
	public void setup() {
		 driver = new ChromeDriver();
		  driver.get("https://www.demoblaze.com/");
		  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hp=new Homepage(driver);
	    cp = new cartpage(driver);
	    pp = new ProductStore(driver);
	}
	
	public static void getScreenshot(WebDriver driver,String name) throws InterruptedException
	{
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(System.getProperty("user.dir")+"//Screenshot"+name+System.currentTimeMillis()+".png");
	try {
		FileHandler.copy(temp,dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
	public void addWait()
	{
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
