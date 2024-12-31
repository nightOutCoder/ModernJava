package com.modernjava.java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodExample {
	public static void main(String arg[]) {
		// Old way - To create unmodifiable list pre java 9
		List<String> names = new ArrayList();
		names.add("test1");	
		names.add("test2");	
		names.add("test3");	
		names.add("test4");
		names = Collections.unmodifiableList(names);
		//names.add("test5"); /* UnsupportedOperationException */
		
		
		// New way - java 9
		List<String> namesList = List.of("Test1","Test2","Test3");
		System.out.println(namesList);
		// namesList.add("Test"); /* UnsupportedOperationException */
		
		Set<String> namesSet = Set.of("Test-1","Test-2","Test-3");
		System.out.println(namesSet);
		//namesSet = Set.of("Test-1","Test-1","Test-3"); /* IllegalArgumentException */
		
		Map<String, String> namesMap = Map.of("Test~1", "TestValue~1", "Test~2", "TestValue~2");
		System.out.println(namesMap);
		
		
	}
}
