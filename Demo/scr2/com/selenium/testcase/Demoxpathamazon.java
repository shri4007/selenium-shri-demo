package com.selenium.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoxpathamazon {
	public static void main(String[] args) throws InterruptedException {
		//open browser
		System.setProperty("webdriver.chrome.driver" ,".//browserdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.in";
		// open application
		driver.get(url);
		
		//Maximize current window
		driver.manage().window().maximize();
		
		List<WebElement> li_tab = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(li_tab.size());
		
		//print header
		for(WebElement we: li_tab) {
			 System.out.println(we.getText());
			 Thread.sleep(500);
			 //click on button
			 
		/* List<WebElement> loginBtn = driver.findElements(By.className("//div[@class='nav-search-scope nav-sprite']"));
		 ((WebElement) loginBtn).click();
				System.out.println(loginBtn.size());
			for(WebElement we1: li_tab) {
					
				System.out.println(we1.getText());
					Thread.sleep(2000);*/
			 
			 
		}
 		
	}

	}
