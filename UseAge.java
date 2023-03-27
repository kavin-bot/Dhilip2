package com.java8;

public class UseAge {
	public static void main(String [] args) {
		
		Age z = a->{
			
			if(a>=18) {
				return "Eligible to Vote";
			}
			else {
				return "Not Eligible to Vote";
			}
		};
		
		int a = 22;
		
		System.out.println(z.findVoteAge(a));
		
	}

}
