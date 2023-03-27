package com.java8;

public interface Car {
	public static String findBrand(String brand) {
		return brand;
	}
	public default String findTyreType(boolean isTubeless) {
		
		if(isTubeless == true) {
		return "NO need to fix Puncture";
	}
		else {
			return "Need to Fix Puncture";
		}
	}
	
	public String findPrice(int price) ;
}
