package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
	public static void main(String a[]) {
		List<Instructor> instructors = Instructors.getAll();
		
		// looping through all the instructor and printing out the values
		Consumer<Instructor> c1 = (x) -> System.out.println(x);
		instructors.forEach(c1);
		
		System.out.println("--------------------------------------------------------------------------------------------");
		// looping through all the instructor and print only name
		Consumer<Instructor> c2 = (x) -> System.out.println(x.getName());
		instructors.forEach(c2);
		
		System.out.println("--------------------------------------------------------------------------------------------");
		// looping through all the instructor and print only name and courses
		Consumer<Instructor> c3 = (x) -> System.out.println(x.getCourses());
		instructors.forEach(c2.andThen(c3));
		
		System.out.println("--------------------------------------------------------------------------------------------");
		// loop through and print name if years of experience greater than Ten
		instructors.forEach(data -> {
			if(data.yearsOfExperienc > 10) {
				c2.accept(data);
			}
		});
		
		System.out.println("--------------------------------------------------------------------------------------------");
		// loop through and print name and experience if years of experience greater than Eleven and teaches course online
		instructors.forEach(data -> {
			if(data.yearsOfExperienc > 11 & data.onlineCourses) {
				c1.andThen(c2).accept(data);
			}
		});
	}
}
