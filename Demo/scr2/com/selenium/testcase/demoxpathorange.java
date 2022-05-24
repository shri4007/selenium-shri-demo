package com.selenium.testcase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;


	public class demoxpathorange {
		public static void main(String[]args) {
			//open browser
			System.setProperty("webdriver.chrome.driver" ,".//browserdrivers//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			String url = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
			// open application
			driver.get(url);
			
			//Maximize current window
			driver.manage().window().maximize();
			
			 //login
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			//click
			WebElement loginBtn = driver.findElement(By.className("button"));
			loginBtn.click();
			
			List<String> tabNames = new ArrayList<>();
			System.out.println(tabNames);
			
			List<WebElement>tab_List = driver.findElement(By.xpath("//div[@id=mainMenu]/ul/li/a/b"));
			
			for(int i=1; i <= tab_List.size();i++) {
			String tab = driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li["+i+"]/a/b")).getText();
			System.out.println("Tab name:"+tab);
			tabNames.add(tab);
			}
			System.out.println(tabNames);
			
			
			//List<WebElement> tab_list = driver.findElements(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
			
			
			
			//List<WebElement> li= driver.findElements(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
			
			//System.out.println(li.size());

		
	}
	}	
	
