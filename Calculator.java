package com.java8;
@FunctionalInterface
public interface Calculator {
	public int math(int a,int b);

	
	public static void printOperation(String a) {
		System.out.println(a);
	}
	
	
	public default String activity() {
		return "Arithematic Operation";
	}

}
