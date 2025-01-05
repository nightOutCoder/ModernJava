package com.modernjava.optionalexample;

import java.util.Optional;

public class OptionalOrElseThrowExample {
	public static void main(String arg[]) {
		
		// orElse
		Integer[] numers = new Integer[10];
		numers[0] = 1;
		Optional<Integer> number = Optional.ofNullable(numers[0]);
		int result = number.orElse(-1);
		System.out.println(result);
		
		
		// orElseGet
		int results = number.orElseGet(() -> -1);
		System.out.println(results);
		
		// orElseThrow
		try {
		int resultsRef = number.orElseThrow(Exception::new);
		System.out.println(resultsRef);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
