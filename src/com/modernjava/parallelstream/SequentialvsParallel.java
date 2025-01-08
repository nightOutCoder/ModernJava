package com.modernjava.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialvsParallel {
	public static void main(String args[]) {
		int loop = 20;
		long result = measurePerformance(SequentialvsParallel::sumSequentialStream, loop);
		System.out.println("Time taken to proces sum in sequential = " + result);
		
		
		long results = measurePerformance(SequentialvsParallel::sumParallStream, loop);
		System.out.println("Time taken to proces sum in parallel = " + results);
	}
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(0, 50000).sum();
	}
	
	public static int sumParallStream() {
		return IntStream.rangeClosed(0, 50000).parallel().sum();
	}
	
	
	/* Sequential Vs Parallel performance */
	public static long measurePerformance(Supplier<Integer> supplier, int numberOfTimes) {
		long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < numberOfTimes;i++) {
			supplier.get();
		}
		return  System.currentTimeMillis() - startTime;
	}
}
