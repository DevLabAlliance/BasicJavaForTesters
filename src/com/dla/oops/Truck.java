package com.dla.oops;

public class Truck extends Vehicle{
	
	public void brandName() {
		System.out.println("It's Tata truck");
	}

	public static void main(String[] args) {
		
		Truck objTruck = new Truck();
		
		objTruck.engine();
		
		objTruck.brandName();

	}

}
