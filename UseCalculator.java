package com.java8;

public class UseCalculator {
	public static void main(String [] args) {
		
		//Calculator k = new Calculator();
		
		Calculator add = (a,b)-> a+b;
		System.out.println(add.math(16,15));
		
		Calculator.printOperation("addition");
		System.out.println(add.activity());
		
	}

}
