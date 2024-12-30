package com.modernjava.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

public class StreamExample {
	public static void main(String arg[]) {
		
		// creating a map of names and course of instructors who teaches online
		// also have more than 10 year of experience
		
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();
		Predicate<Instructor> p2 = (i) -> i.getYearsOfExperienc() > 10;
		
		List<Instructor> list = Instructors.getAll();
		
		Map<String, List<String>> map = list
											.stream()
											.filter(p1)
											.peek(s -> System.out.println(s))
											.filter(p2)
											.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		
		//System.out.println(map);
		
		
	}
}
