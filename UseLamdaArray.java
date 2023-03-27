package com.java8;

public class UseLamdaArray {
	public static void main (String [] args) {
		
	
		LamdaArray positive = (a)->{ for(int i=0; i<a.length ;i++) {
		
			if(a[i]>0) {
			System.out.println(a[i]);
					
			}
		    }
		    };
		    
		    int [] nums = {-20,0,50,60,-49};
		
	    positive.findPositiveNum(nums);
		
	}

}
