package com.modernjava.optionalexample;

import java.util.Optional;

public class OptoinalIfIsExample {
	public static void main(String args[]) {
		//isPresent
		Optional<String> stringOp = Optional.ofNullable("Hello World");
		if(stringOp.isPresent())
			System.out.println(stringOp);
		
		//ifPresent
		stringOp.ifPresent(s -> System.out.print(s));
	}
}
