package com.dla.arrays;

public class ArraysExample {

	
	public void arrayMethod(){
		
		int [] arrayVar = {1,2,3,4,5};
		
		String [] strArray = {"fname","lname","dob"};
		
		System.out.println(strArray[0]);
		
		System.out.println(strArray[1]);
		
		System.out.println(strArray[2]);
		
		
		//array size is decided at the time of creation and can't be alter later
//		strArray[3] = "city";
		
		System.out.println(strArray[3]);
		
		System.out.println("Length of Array is :"+strArray.length);
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println("Print array content from For Loop : "+strArray[i]);
		}
		
		//For-Each Loop
		for(String str : strArray) {
			
			System.out.println("Print Array using For-Each Loop : "+str);
			
		}
		
		
		
	}
	public static void main(String[] args) {
		ArraysExample arrayObject = new ArraysExample();
		
		arrayObject.arrayMethod();
		
	}

}
