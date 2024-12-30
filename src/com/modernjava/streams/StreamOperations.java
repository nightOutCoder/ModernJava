package com.modernjava.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

public class StreamOperations {
	public static void main(String arg[]) {
		List<Instructor> data = Instructors.getAll();
		
		/* map operation */
		List<String> result = data.stream().map(x -> "Mr. "+x.getName()).collect(Collectors.toList());
		System.out.println(result);
		
		/* flatMap operation Example 1 */
		/* Get all the courses of all the instructors */
		Set<String> instructorsCourses = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).collect(Collectors.toSet());
		System.out.println(instructorsCourses);
		
		/* flatMap operation Example 1 */
		List<List<Integer>> listData = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(11,22,33),Arrays.asList(101,201,3));
		List<Integer> listInteger = listData.stream().flatMap(List:: stream).collect(Collectors.toList());
		System.out.println(listInteger);
		
		/* Count operation */
		Long count = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).count();
		System.out.println(count);
		
		/* distinct operation */
		Long distinct = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).distinct().count();
		System.out.println(distinct);
		
		/* distinct operation */
		List<String> sorted = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).distinct().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		/* Any Match*/
		boolean anyMatch = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).anyMatch(x -> x.startsWith("s"));
		System.out.println(anyMatch);
		
		/* all Match*/
		boolean allMatch = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).allMatch(x -> x.startsWith("J"));
		System.out.println(allMatch);
		
		/* none Match*/
		boolean noneMatch = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).noneMatch(x -> x.startsWith("x"));
		System.out.println(noneMatch);
		
		/* customized sort */
		/* Get all instructors name in sorted */
		List<Instructor> list = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
		System.out.println(list);
		
		/* Get all instructors name in sorted */
		List<Instructor> listReversed = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName).reversed()).collect(Collectors.toList());
		System.out.println(listReversed);
	}
}
