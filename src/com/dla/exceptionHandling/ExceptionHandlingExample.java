package com.dla.exceptionHandling;

public class ExceptionHandlingExample {

	public void arrayMethod() {

		try {
			String[] strArray = { "fname", "lname", "dob" };

			System.out.println("Array Length is : " + strArray.length);

			System.out.println(strArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("exception is :" + e);
		} catch (Exception e1) {
			System.out.println("Exception caught in second catch block : " + e1);
		} finally {
			System.out.println("Finally Block executed");
		}

		System.out.println("After Exception");

	}

	public static void main(String[] args) {

		ExceptionHandlingExample exceptionHandlingObj = new ExceptionHandlingExample();

		exceptionHandlingObj.arrayMethod();
	}

}
