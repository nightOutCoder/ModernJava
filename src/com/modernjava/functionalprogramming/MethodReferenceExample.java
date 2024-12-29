package com.modernjava.functionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
	public static void main(String arg[]) {
		Predicate<Instructor> p1 = a -> a.isOnlineCourses();
		Predicate<Instructor> p2 = Instructor::isOnlineCourses;
		
		Function<Integer, Double> sqrt1 = a -> Math.sqrt(a);
		Function<Integer, Double> sqrt2 = Math::sqrt;
		
		Function<String, String> lowerCase1 = a -> a.toLowerCase();
		Function<String, String> lowerCase2 = String::toLowerCase;
	}
}
