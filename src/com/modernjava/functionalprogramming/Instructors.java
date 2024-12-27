package com.modernjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	public static List<Instructor> getAll(){
		Instructor instructor1 = new Instructor("Mike",10,"Sr. Engineer","Male", true, Arrays.asList("C++","Python"));
		Instructor instructor2 = new Instructor("Tom",11,"Intern Engineer","Male", false, Arrays.asList("C",".Net Core"));
		Instructor instructor3 = new Instructor("Jack",12,"Staff Engineer","Female", true, Arrays.asList("scala","Java"));
		Instructor instructor4 = new Instructor("Alan",13,"Principal Engineer","Male", false, Arrays.asList("C","php"));
		
		List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3,instructor4);
		return list;
	}
	
	

}
