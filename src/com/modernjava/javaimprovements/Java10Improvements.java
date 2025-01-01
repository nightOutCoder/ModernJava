package com.modernjava.javaimprovements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java10Improvements {
	public static void main(String arg[]) {
		
		
		/* Java 10 - var */
		var name = "Tata";
		System.out.println(name);
		
		HashMap<Integer, String> map = new HashMap<>();
		var mapRef = new HashMap<Integer, String>();
		
		int[] numbers = {1,2,3,4};
		var numbersRef = new int[] {1,2,3,4};
		
		List<String> names = new ArrayList<>();
		names.add("aa1");
		names.add("aa2");
		names.add("aa3");
		names.add("aa4");
		System.out.println("names "+names);
		
		var namesRef = new ArrayList<>();
		namesRef.add("AA1");
		namesRef.add(101);
		namesRef.add(1.09);
		System.out.println("namesRef "+namesRef);
		
		// Note - Here we are able to add anything until we specify the type
		// var namesRef = new ArrayList<String>();
		
		var integers = List.of(1,2,3,4,5);
		integers.forEach(System.out::println);
		
		var result = 9/2;
		System.out.println("Result = "+ result);
 	}
}
