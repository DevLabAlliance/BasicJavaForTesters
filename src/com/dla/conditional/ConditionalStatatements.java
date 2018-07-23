package com.dla.conditional;

public class ConditionalStatatements {
	
	
	// return true is a and b are equal else return false
	public boolean firstIfCondition(int a, int b){
		
		if(a == b) {
			
			System.out.println("a and b are equal");
			
			return true;
		}
		
		return false;
	}
	
	public boolean firstIFElseCondition(int a, int b){
		
		if(a == b) {
			System.out.println("a and b are equal");
			return true;
		}
		else {
			System.out.println("a and b are not equal");
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		ConditionalStatatements obj = new ConditionalStatatements();
		
		boolean output = obj.firstIfCondition(10, 20);
		
		System.out.println("comparision is : "+output);
		
		obj.firstIFElseCondition(10, 20);
		
		obj.firstIFElseCondition(20, 20);

	}

}
