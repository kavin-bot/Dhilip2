package com.java8;
import java.util.function.Supplier;
public class SupplierPro {
	public static void main(String [] args) {
		
		Supplier<String> c =()->"Hello World";
		//System.out.println(c.get());
		
		if(c.equals("hello world")) {
			System.out.println("Both are Equal");
		}
		else {
			System.out.println("Both are Not Equal");
		}
		
	}

}
