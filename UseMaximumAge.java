package com.java8;

public class UseMaximumAge {
	public static void main (String [] args) {
		
		MaximumAge z = (a,b,c)->{
			
			if(a>b && a>c) {
				return a;
			}
			else if (b>a && b>c) {
				return b;
			}
			else {
				return c;
			}
		};
		
		System.out.println(z.findMaximumAge(12, 34, 5));
	}

}
