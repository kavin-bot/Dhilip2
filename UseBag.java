package com.java8;

public class UseBag {
	public static void main(String [] args) {
		
		Bag z = (a,b)->a+b;
		
		int a= 10;   //int a = Integer.parseInt(args[0]);
		int b = 20;  // int b = Integer.parseInt(args[1]);
		System.out.println(z.findPrice(a,b));
		
	}

}



