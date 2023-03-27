package com.java8;

import java.util.Optional;

public class OptionalINT {
	public static void main(String [] args) {
		int a = 0;
		
		Optional <Integer> check = Optional.ofNullable(a);
		
		if(check.isPresent()) {
			System.out.println("Available");
		}
		else {
			System.out.println("Not Available") ;
		}
		
	}

}
