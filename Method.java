package com.java8;

public class Method {
	
	//int z[]= {12,32,15,7};
	//String [] k = {"Dhilip","Dineshkumar","Arun"};
	
	public int findMax(int[] z) {
		
		int max = z[0];
	//	int min =z[1];
		for(int i = 0 ; i<z.length;i++) {
			if(max<z[i]) {
				max=z[i];
		
			}
			else {
				
			}
		}
		return max;
		
	}
public int findMin(int[] z) {
		

		int min =z[1];
		for(int i = 0 ; i<z.length;i++) {
			if(min>z[i]) {
				min=z[i];
		
			}
			else {
				
			}
		}
		return min;
}
public String findLength (String [] k) {
	
	int max=k[0].length();
	String name= "";
	for(String z : k) {
	//for(int i =0 ; i<k.length ; i++) {
		
	
		if(max<z.length()) {
			max=z.length();
			name=z;
	
	}
		else {
			
		}
	}
		return name;

}
}
