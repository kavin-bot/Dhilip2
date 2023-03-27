package com.java8;
import java.util.Scanner;
public class ValueInScanner {
	public static void main(String [] args) { 
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter your name");
		
		String name = s.nextLine();
		
		System.out.println("Enter your father name");
		
		String fatherName = s.next();
		
		System.out.println("Enter your age");
		
		int age =s.nextInt();
		
		System.out.println("Enter your Phone number");
		
		long num = s.nextLong();
		
		System.out.println("Fullname ="+name+"\nAge="+age+"\nFatherName="+fatherName+"\nNumber="+num);
		
	}

}
