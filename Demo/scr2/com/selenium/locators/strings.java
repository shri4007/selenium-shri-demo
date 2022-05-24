package com.selenium.locators;

import java.util.Arrays;
import java.util.regex.Pattern;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class strings {
	
	public static void main(String[]args){
		String s = "shri07";
		System.out.println(Pattern.matches("[a-z][A-Z0-9]{6}", s));
		//true
		System.out.println(s.charAt(2));
		
		//compareTo()

		String str1 = "Selenium";
		 String str2 = "selenium";
		 String str3 = new String("Selenium");
		 
		System.out.println(str1.compareTo(str3));
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.concat(str3));
		System.out.println(str1+str3);
		
		//contains
		String course ="Web application test automation";
		System.out.println(course.contains("automation"));
		
		//endwith 
		System.out.println(course.endsWith("automation"));
		System.out.println(course.startsWith("web"));
		
		String word = "anything that print support(123456)";
		//index of
		System.out.println(word.indexOf("support"));
		System.out.println(word.replace("print", "s"));
		
		//split
		String str6 = "hi, m, shri07";
		String[] ss = str6.split(",");
		System.out.println(Arrays.toString(ss));
		
		//substring
        str6.substring(6);
        System.out.println(str6.substring(4));
        System.out.println(str6.substring(2,4));
        
        //  char array
        String str7 ="shri";
        char[]c = str7.toCharArray();
        System.out.println(Arrays.toString(c));
        
        char[] c2 = new char[c.length];
        for (int i=0;i<c.length;i++) {System.out.println(c[i]);
        	c2[i]=c[c.length-i-1];
        }
        System.out.println(Arrays.toString(c2));
        String str8 = new String(c2);
        System.out.println(str8);
        
        String str9 = "shri";
        System.out.println(str9.trim());
        	
	}

}
 