package scr4;

public class Dog extends Animal {
	String name = "Dog";
	public void bites() {
		System.out.println("its bites");
		
	}

 public static void main(String[] args) {
	 Dog obj = new Dog();
	 String str = obj.name;
	 System.out.println("str");
	 obj.bites(); 
	 ((Animal) obj).Run();
}
}
