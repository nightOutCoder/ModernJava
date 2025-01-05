package com.modernjava.optionalexample;

import java.util.Optional;

public class OptionalOfEmptyExample {
	public static void main(String args[]) {
		//Optional<String> opString = Optional.of(null);	
		Optional<String> opString = Optional.ofNullable(null);	
		System.out.println(opString);
		
		
		System.out.println(getWords());
	}
	
	public static Optional<String> getWords(){
		String[] words = new String[10];
		//words[1] = "test";
		Optional<String> optional = Optional.ofNullable(words[1]);
		if(optional.isPresent())
			return optional;
		else 
			return optional.empty();
	}
}

