package com.modernjava.streams;

import java.util.Random;
import java.util.stream.IntStream;

public class NumericStreamExample {
	public static void main(String arg[]) {
		
		// using of 
		IntStream intStream = IntStream.of(1,2,3,4,5,6);
		intStream.forEach(System.out::println);
		System.out.println("----------------------");
		
		
		// iterate
		intStream = IntStream.iterate(0, i -> i + 2).limit(5);
		intStream.forEach(System.out::println);
		System.out.println("----------------------");
		
		
		// Generate 
		intStream = IntStream.generate(new Random()::nextInt).limit(5);
		intStream.forEach(System.out::println);
		System.out.println("----------------------");
		
		
		// via range
		intStream = IntStream.range(1,5);
		intStream.forEach(System.out::println);
		System.out.println("----------------------");
		
		// via rangeClose
		intStream = IntStream.rangeClosed(1,5);
		intStream.forEach(System.out::println);
		
		
		
		/*
		 * 
		 *  Same above we could try for LongStream and DoubleStream
		 * 
		 */
	}
}
