package com.java8;
import java.util.function.*;
public class FunctionPro {
	public static void main(String [] args) {
	
	Function <Integer,Integer> a = (x)->x;
	//System.out.println(a.apply(200));
     int x = Integer.parseInt(args[0]);
	if(x>300) {
		System.out.println(a.apply(x+500));
	}
	else {
		System.out.println(a.apply(x-100));
	}
	
	
	
}
}

