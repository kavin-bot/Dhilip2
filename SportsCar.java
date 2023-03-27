package com.java8;

public class SportsCar implements Car{
	
public  String findTyreType(boolean isTubeless) {
		
		if(isTubeless == true) {
		return "Only need to fill Air";
	}
		else {
			return "Need to Fix Puncture";
		}
	}
	
	public String findPrice(int price) {
		
		if(price>5000000) {
			return "SemiSports";
		}
		else {
			return "Sports";
		}
	}

	

}
