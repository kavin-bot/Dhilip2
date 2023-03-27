package com.java8;

public class Chair implements Wood{
	
	public  String findPrice(int price) {
		if(price>500) {
		return "Quality";
		}
		else {
			return "NO Quality";
		}
	}
	public String findWarranty(boolean isWarranty) {
		if(isWarranty == true) {
			return "Warranty Available";
		}
		else {
			return "NO Warranty";
		}
	}


}
