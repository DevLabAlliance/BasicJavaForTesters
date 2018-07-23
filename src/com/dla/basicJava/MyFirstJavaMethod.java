package com.dla.basicJava;

/**
 * My First Java class to learn Methods and Constructors
 * @author sasachik
 *
 */
public class MyFirstJavaMethod {
	
	//default constructor
	public MyFirstJavaMethod() {
		System.out.println("Calling Default Constructor");
	}
	
	
	//method type - void
	public void testMethod(){
		
		int i = 10;
		
		int j = 20;
		
		int k = i + j;
		
		
		System.out.println(k);
		
		System.out.println("First Java method");
		
	}
	
	//method type - return int value 
	public int testReturnMethod(){
		
		int i = 10;
		
		int j = 20;
		
		int k = i + j;
		
//		System.out.println(k);
		
		return k; 
		
	}
	
	

	public static void main(String[] args) {
		
		MyFirstJavaMethod myObject = new MyFirstJavaMethod();
		
		myObject.testMethod();
		
		int result = myObject.testReturnMethod();
		
		System.out.println("Output of testReturnMethod is : "+result);

	}

}
