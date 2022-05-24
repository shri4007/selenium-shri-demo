package scr3.java;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginlogout {
	static WebDriver driver; 
	    
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",".//browserdrivers//chromedriver.exe");
        driver= new ChromeDriver();
        // maximize
        driver.manage().window().maximize();
        String loginURL= "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		driver.get(loginURL);
	}
   //enter name
	public void enterUserName (String name){
		driver.findElement(By.id("txtUsername")).sendKeys(name);
		// enter password
	}
	public void entepassword(String pwd){
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}//click login
	
	public void clickloginBtn(){
		WebElement LoginBtn =driver.findElement(By.id("btnLogin"));LoginBtn.click();
		 
	}
	public void VerifyUserName(String uName) {
		WebElement welcomeLink = driver.findElement(By.id("welcome"));welcomeLink.click();
		String welcomeText = welcomeLink.getText();
		System.out.println("print string value:"+welcomeText);
		
	}
	public void ClickWelcomelink() throws InterruptedException{ 
		// click welcome username link
		WebElement welcomeLink = driver.findElement(By.id("welcome"));welcomeLink.click();
		
	welcomeLink.click();
	Thread.sleep(2000);
		
		
	}
	// logout
	
 public void clickLogoutlink()throws InterruptedException{
	 WebElement Logoutlink = driver.findElement(By.linkText("Logout"));
	 Logoutlink.click();
	 Thread.sleep(2000);
		
	 
	 }
		
	}
	 
	
	  

