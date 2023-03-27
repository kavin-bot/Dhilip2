package com.java8;

import java.util.ArrayList;

public class UseMaximum {
	public static void main(String [] args) {
		
		Method m = new Method();
		Maximum ma = m :: findMax;
		
		//int[]a = {12,4,99,450};
		//System.out.println(ma.findMaximum(a));
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(12);
		nums.add(4);
		nums.add(99);
		nums.add(450);
		
		
		nums.forEach(x->System.out.println(x));
	}

}
