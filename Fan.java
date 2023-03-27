package com.java8;

public class Fan {
	public String findPrice(int price) {
		
		if(price>1000) {
			return "Expensive";
		}
		else {
			return "Cheap";
		}
	}
	public String findBrand (String brand) {
		return "Brand = "+brand;
		
	}

}
