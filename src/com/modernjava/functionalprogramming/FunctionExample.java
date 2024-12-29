package com.modernjava.functionalprogramming;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionExample {
	public static void main(String arg[]) {
		/* Double is the Return value argument */
		Function<Integer, Double> sqrt = (n) -> Math.sqrt(n);
		System.out.println("Square Root is "+sqrt.apply(81));
		
		/* Lower case */
		Function<String, String> lowerCase = (s) -> s.toLowerCase();
		System.out.println("Lower Case "+lowerCase.apply("KUMAR"));
		
		/* Lower case and then concat */
		Function<String, String> concate = (s) -> s.concat(" Swamy");
		System.out.println("Lower Case "+lowerCase.andThen(concate).apply("KUMAR"));
		
		/* First compose and then apply Function */
		System.out.println(lowerCase.compose(concate).apply("KUMAR"));
		System.out.println("---------------------------------------------------------------------------");
		
		
		
		
		/* Instructor Example with Function */
		
		/* Map of instructors with name and years of experience */
		// Function which will take List<Instructor> and return a map<String, Integer>
		
		Function<List<Instructor>, Map<String,Integer>> mapFunction = (data) -> {
			Map<String, Integer> map = new HashMap<>();
			data.forEach(a -> {
				map.put(a.getName(),a.getYearsOfExperienc());
			});
			return map;
		};
		System.out.println(mapFunction.apply(Instructors.getAll()));
		System.out.println("---------------------------------------------------------------------------");
		
		
		// Function which will take List<Instructor> and return a map<String, Integer> who has online courses
		Function<List<Instructor>, Map<String,Integer>> mapFunction1 = (data) -> {
			Map<String, Integer> map = new HashMap<>();
			data.forEach(a -> {
				if(a.isOnlineCourses()) {
					map.put(a.getName(),a.getYearsOfExperienc());
				}
			});
			return map;
		};
		System.out.println(mapFunction1.apply(Instructors.getAll()));
		System.out.println("---------------------------------------------------------------------------");
		
		
		// Same above but with Predicate
		Predicate<Instructor> predicate = (a) -> a.isOnlineCourses() == true;
		
		Function<List<Instructor>, Map<String,Integer>> mapFunction2 = (data) -> {
			Map<String, Integer> map = new HashMap<>();
			data.forEach(a -> {
				if(predicate.test(a)) {
					map.put(a.getName(),a.getYearsOfExperienc());
				}
			});
			return map;
		};
		System.out.println(mapFunction2.apply(Instructors.getAll()));
		System.out.println("---------------------------------------------------------------------------");
		
		
		
		/* BiFunction Interface */
		// BiFunction takes 2 input - List<Instructor>, Predicate which filter instructor having online courses
		// Return map<String, Name> - String is the name, Integer is the years of experience
		
		Predicate<Instructor> predicateIns = (a) -> a.isOnlineCourses() == true;
		
		BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> biFunction = (data, predi) -> {
			
			Map<String, Integer> map = new HashMap<>();
			
			data.forEach(a -> {
				if(predi.test(a)) {
					map.put(a.getName(), a.getYearsOfExperienc());
				}
			});
			return map;
		};
		System.out.println(biFunction.apply(Instructors.getAll(), predicateIns));
		System.out.println("---------------------------------------------------------------------------");
		
		
		// UnaryOperator Example 
		UnaryOperator<Integer> unaryOperator = a -> a * 10;
		System.out.println(unaryOperator.apply(101));
		
		IntUnaryOperator intUnaryOperator = a -> a*10;
		System.out.println(intUnaryOperator.applyAsInt(100));
		
		LongUnaryOperator longUnaryOperator = a -> a*1000000000000L;
		System.out.println(longUnaryOperator.applyAsLong(100));
		
		DoubleUnaryOperator doubleUnaryOperator = a -> a*10.5;
		System.out.println(doubleUnaryOperator.applyAsDouble(100));
		System.out.println("---------------------------------------------------------------------------");
		
		
		// BinaryOperator Example 
		
		/*Sum of two numbers*/
		BinaryOperator<Integer> binaryhOperator = (a,b) -> a+b;
		System.out.println(binaryhOperator.apply(2,4));
		
		/* Max of two */
		Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
		BinaryOperator<Integer> binaryhOperator1 = BinaryOperator.maxBy(comparator);
		System.out.println(binaryhOperator1.apply(2,4));
		
		
		/* Min of two */
		BinaryOperator<Integer> binaryhOperator2 = BinaryOperator.minBy(comparator);
		System.out.println(binaryhOperator2.apply(2,4));
		
		IntBinaryOperator intBi = (a,b) -> a * b;
		System.out.println(intBi.applyAsInt(3,4));
		
		LongBinaryOperator longBi = (a,b) -> a * b;
		System.out.println(longBi.applyAsLong(2,4L));
		
		DoubleBinaryOperator doubleBi = (a,b) -> a * b;
		System.out.println(doubleBi.applyAsDouble(2,4.3));
		
	}
}
