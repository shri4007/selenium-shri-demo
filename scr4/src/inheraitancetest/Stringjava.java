package inheraitancetest;

public class Stringjava {
	public static void main(String[] args) {
		String str2 = "Hi this selenium";
		String str3 = "selenium";
		String str4 = "selenium2";
		
		System.out.println("hi"+str2.contains(str3));
		System.out.println("hello"+str2.contains(str4));
		
		String[]strarry =str2.split("");
		for (int i =0;i< strarry.length;i++);
		
		if(strarry[i].equalsIgnoreCase(str3)) {
			System.out.println("matched");
		}else {
			System.out.println(" not matched");
		}
		
	}
	

}
