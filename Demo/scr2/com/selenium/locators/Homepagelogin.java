
package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepagelogin {
	public static void main(String[] args ) {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\work class\\Demo\\browserdrivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys(" Admin");
	WebElement username1 = driver.findElement(By.name("txtPassword"));
	username1.sendKeys(" Admin123");
	WebElement username2 = driver.findElement(By.name("Submit"));
 
	
	
	
	
	}

}
