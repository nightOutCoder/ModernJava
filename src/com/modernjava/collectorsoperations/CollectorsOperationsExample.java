package com.modernjava.collectorsoperations;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

public class CollectorsOperationsExample {
	public static void main(String args[]) {
		
		/* joining */
		String reresultJoiningsult = Stream.of("A","B","C","E").collect(Collectors.joining());
		System.out.println(reresultJoiningsult);
		
		reresultJoiningsult = Stream.of("E","F","G","H").collect(Collectors.joining(","));
		System.out.println(reresultJoiningsult);
		
		reresultJoiningsult = Stream.of("I","J","K","L").collect(Collectors.joining(",","{","}"));
		System.out.println(reresultJoiningsult);
		
		// Instructors names seperated by ' and prefix and { and suffix }
		String namesInstructors = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.joining(",","{","}"));
		System.out.println(namesInstructors);
		System.out.println("---------------------------------");
		
		
		
		/* Counting - It is helpful in downstream operations */ 
		long count = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).count();
		System.out.println("count ="+count);
		
		count = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).collect(Collectors.counting());
		System.out.println("count ="+count);
		System.out.println("---------------------------------");
		
		
		
		/* mapping */
		List<String> namesList = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toList());
		namesList.forEach(System.out::println);
		System.out.println("---------------------------------");
		
		namesList = Instructors.getAll().stream().collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
		namesList.forEach(System.out::println);
		
		
		
		/* minBy & maxBy */
		Optional<Instructor> instructor = Instructors.getAll().stream().min(Comparator.comparing(Instructor::getYearsOfExperienc));
		System.out.println("instructor = "+ instructor);
		
		instructor = Instructors.getAll().stream().collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperienc)));
		if(instructor.isPresent()) {
			System.out.println("instructor = "+ instructor);
		}
		System.out.println("---------------------------------");
		
		
		
		/* summingInt & averagingInt */
		int sum = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperienc));
		System.out.println("sum = "+ sum);
		
		double average = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperienc));
		System.out.println("average = "+ average);
		System.out.println("---------------------------------");
		
		
		/* groupingBy - first overloaded method */
		List<String> namesString = List.of("Rama","Mike","Jenny","Gene","Rajeev");
		Map<Integer,List<String>> reslt = namesString.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("reslt = "+ reslt);
		System.out.println("---------------------------------");
		
		
		// grouping by instructors by their genders
		Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getGender));
		instructorByGender.forEach((key,value) -> {
			System.out.println("key = "+key +", value = "+value);
		});
		System.out.println("---------------------------------");
		
		/* grouping by experience where > 10 are classified as senior rest are junior */
		Map<String, List<Instructor>> instByExp = Instructors.getAll().stream().collect(Collectors.groupingBy(data -> data.getYearsOfExperienc() > 10 ? "Senior" : "Junior"));
		instByExp.forEach((key,value) -> {
			System.out.println("key = "+key +", value = "+value);
		});
		System.out.println("---------------------------------");
		
		
		
		/* groupingBy - second overloaded method */
		List<String> namesStringGroup = List.of("sid","Rama","Mike","Jenny","Gene","Rajeev");
		Map<Integer,List<String>> namesStringGroupResult = namesStringGroup.stream().collect(Collectors.groupingBy(String::length, Collectors.filtering(s-> s.contains("s"), Collectors.toList())));
		System.out.println("namesStringGroupResult = "+ namesStringGroupResult);
		System.out.println("---------------------------------");
		
		
		Map<String, List<Instructor>> dataIns = Instructors.getAll().stream().collect(Collectors.groupingBy(data -> data.getYearsOfExperienc() > 10 ? "Sr." : "Jr.", Collectors.filtering(data->data.isOnlineCourses(), Collectors.toList())));
		dataIns.forEach((key,value) -> {
			System.out.println("key = "+key +", value = "+value);
		});
		System.out.println("---------------------------------");
		
		
		
		
		
		/* partitioningBy */
		/* partition instructors in two groups of instructor - > 10 yoe and <10 yoe */
		Predicate<Instructor> expPredicate = data -> data.getYearsOfExperienc() > 10;
		Map<Boolean, List<Instructor>> partData = Instructors.getAll().stream().collect(Collectors.partitioningBy(expPredicate));
		partData.forEach((key,value) ->{
			System.out.println("key1 = "+key +", value = "+value);
		});
		System.out.println("---------------------------------");
		
		
	}
}
