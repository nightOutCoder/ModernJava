package com.modernjava.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
	/* Steam factory method of iterate and generate */
	
	public static void main(String arg[]) {
		
		// of
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(System.out::println);
		System.out.println("------------");
		
		// iterate generate a stream of 10 even numbers
		Stream<Integer> data1 = Stream.iterate(0,  x -> x +2).limit(20);
		data1.forEach(System.out::println);
		System.out.println("------------");
		
		// generate 10 random numbers
		Stream<Integer> data2 = Stream.generate(new Random()::nextInt).limit(5);
		data2.forEach(System.out::println);
	
	}
}
