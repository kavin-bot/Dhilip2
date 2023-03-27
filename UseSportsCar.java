package com.java8;

public class UseSportsCar {
	public static void main (String [] args) {
		
		SportsCar k = new SportsCar();
		
		System.out.println(Car.findBrand("Ferrari"));
		System.out.println(k.findTyreType(true));
		System.out.println(k.findPrice(600000));
		
		
	}

}
