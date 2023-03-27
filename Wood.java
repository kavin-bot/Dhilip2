package com.java8;
@FunctionalInterface
public interface Wood {
	public static String findMaterial(String material) {
		return material;
	}
	public default String findPrice(int price) {
		
		if(price>500) {
		return "Good";
	}
		else {
			return "Bad";
		}
	}
	public String findWarranty(boolean isWarranty);
    
}
