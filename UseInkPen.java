package com.java8;

public class UseInkPen {
	public static void main(String []args) {
		
		InkPen k = new InkPen();
		
		System.out.println(k.findBrand("Cello"));
		System.out.println(k.findPrice(250));
		
		System.out.println(Pen.findBrand("Nataraj"));
		
		
	}

}
