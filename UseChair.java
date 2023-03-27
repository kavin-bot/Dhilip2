package com.java8;

public class UseChair {
	public static void main(String [] args) {
		
		Chair k = new Chair();
		
		System.out.println(Wood.findMaterial("Teak"));
		System.out.println(k.findPrice(600));
		System.out.println(k.findWarranty(false));
		
	}

}
