package Come.test.basic.java;

  public class helloworld1 {
	public static void main(String[] args) {
		System.out.println("hello world");

		login();

		helloworld1 obj = new helloworld1();
		obj.logout();

	}

	public static void login() {
		System.out.println("static");
	}

	public void logout() {
		System.out.println("non static");

		
	}

}
