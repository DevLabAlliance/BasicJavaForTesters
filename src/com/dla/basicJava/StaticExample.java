package com.dla.basicJava;

public class StaticExample {
	
	static int var = 10;
	
	public static void testStaticMethod(){
		
		System.out.println("Call for Static method");
		
	}

	public static void main(String[] args) {
		
		StaticExample obj = new StaticExample();
//		
//		obj.testStaticMethod();
		
//		int a = obj.var;
		
		int result = var + 1;
		
		testStaticMethod();

	}

}
