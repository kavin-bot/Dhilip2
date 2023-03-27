package com.java8;

public class Mobile implements ElectricItems {
	public String findWorkingState (boolean isOnOff) {
		if(isOnOff==true) {
			return "It is Working but no Display";
		}
		else {
			return "Not Working";
		}
	}


}
