package com.dla.basicJava;

public class MethodsWithArgs {
	
	public void addTwoVariables(int a, int b){
		
		int c = a + b;
		
		System.out.println("Output of addTwoVariables - void type is : "+c);
	}
	
	
	public int addTwoVairablesWithReturn(int a, int b){
		
		int c = a + b;
		
		return c;
		
	}

	public static void main(String[] args) {
		
		MethodsWithArgs objectName = new MethodsWithArgs(); 
		
		objectName.addTwoVariables(10, 20);
		
		objectName.addTwoVariables(30, 40);
		
		
		int result = objectName.addTwoVairablesWithReturn(50, 60);
		
		System.out.println("Output of addTwoVairablesWithReturn - int type is : "+result);
		
		
	}

}
