package com.dla.loops;

public class ForLoopExample {
	
	
	public void forLoopMethod(){
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Number is : "+i);
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Number is - : "+i);
		}
		
	}

	public static void main(String[] args) {
		
		ForLoopExample loopObject = new ForLoopExample();
		
		loopObject.forLoopMethod();

	}

}
