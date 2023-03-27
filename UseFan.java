package com.java8;

public class UseFan {
	public static void main(String [] args) {
		Fan k = new Fan() ;
		
		System.out.println(Electronics.findBrand("Crompton"));
		System.out.println(k.findPrice(1200));
	}

}
