package com.dla.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("fname");
		list.add("lname");
		list.add("lname");
		list.add("lname");
		list.add("lname");
		list.add("lname");
		list.add("dob");

		// For-Each loop

		for (String obj : list) {

			System.out.println("Elements of List : " + obj);

		}

//		list.remove("lname");

		for (String obj : list) {

			System.out.println("Elements of List : " + obj);
			
			System.out.println("Element at 0th index : "+list.get(1));

		}

	}

}
