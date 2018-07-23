package com.dla.loops;

public class WhileLoopExample {
	
	public void whileLoopMethod(){
		
		// print 0 - 9 
		int i = 0;
		while(i<10) {
			System.out.println("Number is : "+i);
			i=i+1;//i++;
		}
		
		
		//print 10 - 1
		
		int j = 10;
		while(j>1) {
			System.out.println("Number is : "+j);
			j=j-1;//j--;
		}
	}

	public static void main(String[] args) {
		
		WhileLoopExample obj = new WhileLoopExample();
		
		obj.whileLoopMethod();

	}

}
