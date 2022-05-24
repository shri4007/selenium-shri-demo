package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingonchrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//browserdrivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String url ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	//open application
	 driver.get(url);
	 
	//login page xpath
	 String uname_xpath ="//input[@name='txtuserName']";
	String pwd_xpath ="//input@type='password']";
	String loginbtn_xpath = "//input[@value='LOGIN]";
	
	//test data to login as admin user
	String username ="Admin";
	String password = "admin123";
	
	//enter user name
	
	driver.findElement(By.xpath(uname_xpath)).sendKeys(username);
	// enter password
	driver.findElement(By.xpath(pwd_xpath)).sendKeys(password);
	// click login
	driver.findElement(By.xpath(loginbtn_xpath));
	
	 // verify dash board print label
}
	
	
	
}
