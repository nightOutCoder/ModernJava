package com.modernjava.streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateFunctionsExample {
	public static void main(String args[]) {
		
		// sum
		int sum = IntStream.rangeClosed(0, 1000).sum();
		System.out.println(sum);
		System.out.println("--------------------");
		
		
		// min
		OptionalInt min = IntStream.rangeClosed(0,1000).min();
		System.out.println(min.getAsInt());
		System.out.println("--------------------");
		
		
		// max
		OptionalInt max = IntStream.rangeClosed(0,1000).max();
		System.out.println(max.getAsInt());
		System.out.println("--------------------");
		
		// average
		OptionalDouble maxDouble = LongStream.rangeClosed(0,1000).asDoubleStream().average();
		System.out.println(maxDouble.getAsDouble());
		
		
	}
}
