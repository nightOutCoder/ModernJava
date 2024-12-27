package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumer {

	public static void main(String arg[]) {
		List<Instructor> instructors = Instructors.getAll();
		
		// all instructor who teaches online
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;
		
		// experience is > 10
		Predicate<Instructor> p2 = (i) -> i.getYearsOfExperienc() > 10;
		
		//BiConsumer print name and courses
		BiConsumer<String, List<String>> biConsumer = (a,b) -> System.out.println("Name is = "+ a + ", Courses are = " + b);
		
		
		instructors.forEach(data -> {
			if(p1.and(p2).test(data)) {
				biConsumer.accept(data.getName(), data.getCourses());
			}
		});
		
	}
}
