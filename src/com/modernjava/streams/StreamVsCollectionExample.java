package com.modernjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
	public static void main(String arg[]) {
		List<String> names = new ArrayList<>();
		names.add("Mike1");
		names.add("Mike2");
		names.add("Mike3");
		names.add("Mike4");
		System.out.println("---------");
		System.out.println(names);
		System.out.println("---------");
		names.remove("Mike3");
		System.out.println(names);
		System.out.println("---------");
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println("----again traverse collection -----");
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println("---------");
		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
		System.out.println("----again traverse stream-----");
		//namesStream.forEach(System.out::println); /* IllegalStateException */
		System.out.println("---------");
		names.stream().filter(s->s.startsWith("M")); /* Streams are lazily constructed */
		
		
	}
}
