package com.modernjava.optionalexample;

import java.util.Optional;

public class OptionalExample {
	public static void main(String args[]) {
		//Integer[] numbers = new Integer[10];
		//int number = numbers[1].intValue();
		//System.out.println(number); /* Throw null pointer exception */
		
		Integer[] numbersRef = new Integer[10];
		Optional<Integer> checkNull = Optional.ofNullable(numbersRef[1]);
		int result = checkNull.isPresent() ? checkNull.get() : -1;
		System.out.println(result);
		
	}
}
