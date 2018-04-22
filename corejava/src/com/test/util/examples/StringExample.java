package com.test.util.examples;

public class StringExample {
	
	public static void main(String s[]) {
		String s1="Rama";
		String s2="Rama";
		String s3=new String("Rama");
		
		if(s1 == s3)
			System.out.println(" Both are Equal ");
		else
			System.out.println("Not Equal");
		
		if(s1 == s2)
			System.out.println("Both are Equal");
		else
			System.out.println("Not Equal");
		
		if(s1.equals(s3))
			System.out.println(" Both are Equal ");
		else
			System.out.println("Not Equal");
	}
	

}
