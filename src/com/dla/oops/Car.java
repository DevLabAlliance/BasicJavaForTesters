package com.dla.oops;

public class Car extends Vehicle{
	
	
	public void carBrand(){
		
		System.out.println("It's Audi");
		
	}

	public static void main(String[] args) {
		
		Car carObject = new Car();
		
		carObject.engine();
		
		carObject.carBrand();

	}

}
