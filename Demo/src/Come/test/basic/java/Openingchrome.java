package Come.test.basic.java;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openingchrome {
  
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\work class\\Demo\\browserdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.findElement(By.className( "desktop-searchBar" )).sendKeys("cloths");

	driver.close();
	
	System.setProperty("webdriver.gecko.driver", "D:\\work class\\Demo\\browserdrivers\\geckodriver.exe");
	
	WebDriver driver1 = new FirefoxDriver();
	driver1.get("https://www.reddit.com/");
	driver1.findElement(By.id("header-search-bar")).sendKeys("mail");
	
	driver1.close();
	}
}
