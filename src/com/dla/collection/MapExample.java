package com.dla.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("fname", "Ram");
		map.put("lname", "Kumar");
		map.put("dob", "01/01/1990");
		map.put("lname", "Singh");
		
		
		System.out.println("Element of Map : "+map.get("lname"));
		
		//Map Iteration based on key For-Each
		for(String str : map.keySet()) {
			
			System.out.println("Elements in Map : Value : "+map.get(str));
			
			
		}
	}

}
