package com.modernjava.functionalprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {
	public static void main(String arg[]) {
		InstructorFactory insFactory = Instructor::new;
		
		Instructor instructor = insFactory.getInstructor("Tony", 16, "Analyst", "Male", true, Arrays.asList("c","php"));
		System.out.println(instructor);
	}

}
