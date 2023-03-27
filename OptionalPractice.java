package com.java8;

import java.util.Optional;

public class OptionalPractice {
	public static void main(String [] args) {
		String a = "Dhilip";
		
		Optional <String> check = Optional.ofNullable(a);
		
		if(check.isPresent()) {
			System.out.println(a.toUpperCase());
		}
		else {
			System.out.println("String is Empty");
		}
		System.out.println(check.orElse("Out of Stock"));
	}

}
