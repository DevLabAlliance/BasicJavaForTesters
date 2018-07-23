package com.dla.oops;

public class MyImplementation implements MyFirstInterface{

	public static void main(String[] args) {
		
		MyImplementation myObj = new MyImplementation();
		
		myObj.testAbstractMethod();

	}

	@Override //annotation - instruction to java that it will behave differently 
	public void testAbstractMethod() {
		
		System.out.println("Implementation of testAbstractMethod in MyImplementation class");
		
	}

}
