package com.java8;

public interface ElectricItems {
	public default String findWorkingState (boolean isOnOff) {
		if(isOnOff==true) {
			return "It isWorking";
		}
		else {
			return "Not Working";
		}
	}

}
