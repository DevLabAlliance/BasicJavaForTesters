package com.dla.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		//Unordered collection and contains only unique values (no duplicate value allowed) and 
		// at most one null value permitted
		Set<Integer> setObject = new HashSet<Integer>();
		
		setObject.add(5);
		setObject.add(5);
		setObject.add(5);
		setObject.add(5);
		setObject.add(1);
		setObject.add(1);
		setObject.add(2);
		setObject.add(3);
		setObject.add(4);
		
		//Iterate the set collection using For-Each
		for(Integer obj : setObject) {
			
			System.out.println("Elements in Set : "+obj);
		}
		
	}

}
