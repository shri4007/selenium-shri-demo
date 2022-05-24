package scr3.java;

public class Loginlogouttest {
	public static void main(String[] args) throws interruptedException, InterruptedException {
		Loginlogout obj = new Loginlogout();
		 obj.openBrowser();
		 obj.enterUserName("Admin");
		 obj.entepassword("admin123");
		 obj.clickloginBtn(); 
		 //create new user
		 obj.ClickWelcomelink();
		 obj.clickLogoutlink();
		 //login as user
		 obj.enterUserName("newuser");
		 obj.entepassword("password");
		 
		  
	}

}
