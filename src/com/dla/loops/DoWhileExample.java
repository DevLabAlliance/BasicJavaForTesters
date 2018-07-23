package com.dla.loops;

public class DoWhileExample {

public void doWhileLoopMethod(){
		
		// print 0 - 9 
		int i = 0;
		do {
			System.out.println("Number is : "+i);
			i++;
		}while(i<10);
		
		
		
		int j = 10;
		do {
			System.out.println("Number is : "+j);
			j++;
		}while(j<10);
	}

	public static void main(String[] args) {
		
		DoWhileExample doWhileObject = new DoWhileExample();
		doWhileObject.doWhileLoopMethod();
	}

}
