package com.modernjava.javaimprovements;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

public class VarWithLambdaExample {
	public static void main(String arg[]) {
		/*
		 * Java 11
		 * var with lambda
		*/
		
		var insturctors = Instructors.getAll();
		
		/* single parameter example */
		Predicate<Instructor> predicate = (var s) -> s.getYearsOfExperienc() > 10;
		insturctors.forEach(data ->{
			if(predicate.test(data)) {
				var result = data.getName();
				System.out.println("Result is -> "+ result);
			}
		});
		
		/*Two parameter example*/
		BiFunction<Integer,Integer,Integer> sum = (var x, var y)-> x + y;
		System.out.println("Sum.apply(2,100) = "+ sum.apply(2,100));
		
		
		//BiFunction<Integer,Integer,Integer> sum = (var x, int y)-> x + y; /* Type should be same */
	}
}
