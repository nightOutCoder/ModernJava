package com.modernjava.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExamle {
	public static void main(String arg[]) {
		List<Integer> numbers;
		
		/* boxing */
		IntStream numStream = IntStream.rangeClosed(0, 12); /*primitive int stream*/
		numbers = numStream.boxed().collect(Collectors.toList());
		numbers.forEach(System.out::println);
		System.out.println("-------------------------");
		
		
		/* unboxing */
		Optional<Integer> sum = numbers.stream().reduce((a,b) -> a+ b);
		if(sum.isPresent())
			System.out.println(sum.get());
		
		int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum1);
	}
}
