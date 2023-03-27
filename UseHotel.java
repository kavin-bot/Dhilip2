package com.java8;

public class UseHotel {
		public String nonVegFood (String foodStatus) {
			return foodStatus;
		}
		public static void main(String [] args) {
			
			UseHotel i = new UseHotel();
			
			Hotel h = i :: nonVegFood;
			
			
			System.out.println(h.vegFood("Available"));
	
			
	}

}
