package com.dla.oops;

public class MyImplementation2 implements MyFirstInterface{

	public static void main(String[] args) {
		
		MyImplementation2 myObj = new MyImplementation2();
		
		myObj.testAbstractMethod();

	}

	@Override
	public void testAbstractMethod() {
		
		System.out.println("Implementation inside MyImplementation2 ");
		
	}

}
