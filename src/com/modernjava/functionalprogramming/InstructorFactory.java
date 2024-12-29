package com.modernjava.functionalprogramming;

import java.util.List;

public interface InstructorFactory {
	public abstract Instructor getInstructor(String name,
	int yearsOfExperienc,
	String title,
	String gender,
	boolean onlineCourses,
	List<String> courses
	);
}
