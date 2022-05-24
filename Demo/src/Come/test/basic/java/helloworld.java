package Come.test.basic.java;

public class helloworld {
	public static void main(String[] args) {
		System.out.println("hello world");

		login();

		helloworld obj = new helloworld();
		obj.logout();

	}

	public static void login() {
		System.out.println("static");
	}

	public void logout() {
		System.out.println("non static");

		
	}

}
