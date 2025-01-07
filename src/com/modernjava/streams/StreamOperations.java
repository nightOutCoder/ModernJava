
package com.modernjava.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
		
		
		
		/*Here in list result would be in the order the data appeared */
		List<String> resultCapital = data.stream().map(x -> "Mr. "+x.getName()).map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(resultCapital);
		
		
		
		/*Here in case of set result will be un-ordered*/
		Set<String> resultInSet = data.stream().map(x -> "Mr. "+ x.getName()).map(x ->x.toUpperCase()).collect(Collectors.toSet());
		System.out.println(resultInSet);
		
		
		
		/* flatMap operation Example 1 */
		/* Get all the courses of all the instructors */
		Set<String> instructorsCourses = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).collect(Collectors.toSet());
		System.out.println(instructorsCourses);
		
		
		
		/* flatMap operation Example 1 */
		List<List<Integer>> listData = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(11,22,33),Arrays.asList(101,201,3));
		System.out.println("List of List = "+ listData);
		List<Integer> listInteger = listData.stream().flatMap(List:: stream).collect(Collectors.toList());
		System.out.println(listInteger);
		
		
		
		/* Count operation */
		Long count = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).count();
		System.out.println("Count = "+count);
		
		
		
		/* distinct operation */
		Long distinct = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).distinct().count();
		System.out.println("distinct = "+distinct);
		
		
		
		/* sorted operation */
		List<String> sorted = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).distinct().sorted().collect(Collectors.toList());
		System.out.println("sorted ="+sorted);
		
		
		
		/* Any Match*/
		boolean anyMatch = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).anyMatch(x -> x.startsWith("s"));
		System.out.println("anyMatch ="+anyMatch);
		
		
		
		/* all Match */
		boolean allMatch = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).allMatch(x -> x.startsWith("J"));
		System.out.println("allMatch ="+allMatch);
		
		
		
		/* none Match */
		boolean noneMatch = Instructors.getAll().stream().map(x -> x.getCourses()).flatMap(List:: stream).noneMatch(x -> x.startsWith("x"));
		System.out.println("noneMatch = "+noneMatch);
		
		
		
		/* customized sort */
		/* Get all instructors name in sorted */
		List<Instructor> list = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
		list.forEach(System.out::println);
		System.out.println("------------");
		
		
		
		/* Get all instructors name in sorted */
		List<Instructor> listReversed = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName).reversed()).collect(Collectors.toList());
		list.forEach(System.out::println);
		System.out.println("------------");
		
		
		
		
		/* Filter Operation */
		List<Instructor> dataFilter = Instructors.getAll().stream().filter(x -> x.getYearsOfExperienc() > 10).sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
		dataFilter.forEach(System.out::println);
		System.out.println("------------");
		
		
		
		/* reduce operation - Example with accumulator */
		List<Integer> listInput = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> listInput1 = Arrays.asList();
		// 0 + 1 = 1
		// 1 + 2 = 3
		// 3 + 4 = 7
		int sumAll = listInput.stream().reduce(0,(a,b) -> a +b);
		System.out.println("sumAll = "+sumAll);
		
		int multiplyAll = listInput.stream().reduce(1,(a,b) -> a * b);
		System.out.println("multiplyAll = "+multiplyAll);
		
		
		
		/* reduce operation - Example without accumulator return Optional */
		Optional dataOptional = listInput1.stream().reduce((a,b) -> a + b);
		System.out.println("dataOptional = "+dataOptional);
		if(dataOptional.isPresent()) {
			System.out.println("Data = "+ dataOptional.get());
		}
		System.out.println("------------");
		
		
		
		/* reduce other example */
		/* printing the instructor who has the highest years of experience */
		Optional instructorData = Instructors.getAll().stream().reduce((s1,s2) -> s2.getYearsOfExperienc() > s1.getYearsOfExperienc() ? s2 : s1);
		if(instructorData.isPresent()) {
			System.out.println("Data = "+ instructorData.get());
		}
		System.out.println("------------");
		
		
		
		/* map filter reduce */
		List<Integer> listDataSource = Arrays.asList(1,2,3,4,5,6,7,8);
		int listDataSourceFinal = listDataSource.stream().map(x -> x*x).filter(x -> x > 20).reduce(0, (a,b) -> a + b);
		System.out.println("listDataSourceFinal = "+ listDataSourceFinal);
		System.out.println("------------");
		
		
		
		/* map filter reduce Example. Total years of experience for all instructors */
		int resultMapFilterReduce = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).map(x -> x.getYearsOfExperienc()).reduce(0,(a,b) -> a+b);
		int resultMapFilterReduce1 = Instructors.getAll().stream().filter(Instructor::isOnlineCourses).map(x -> x.getYearsOfExperienc()).reduce(0,Integer::sum);
		System.out.println("resultMapFilterReduce = "+ resultMapFilterReduce);
		System.out.println("resultMapFilterReduce1 = "+ resultMapFilterReduce1);
		System.out.println("------------");
		
		
		/* max() & max via reduce */
		List<Integer> numersData= Arrays.asList(1,2,3,4,5,6,7,8);
		Optional maxResultData = numersData.stream().max(Integer::compareTo);
		if(maxResultData.isPresent())	
			System.out.println("maxResultData = "+maxResultData.get());
		
		int  maxResultData2 = numersData.stream().reduce(0,(a,b) -> a > b ? a : b);
		System.out.println("maxResultData2 = "+maxResultData2);
		
		Optional maxResultData3 = numersData.stream().reduce((a,b) -> a > b ? a : b);
		if(maxResultData3.isPresent())
			System.out.println("maxResultData2 = "+maxResultData3.get());
		
		
		Optional maxResultData4 = numersData.stream().reduce(Integer::max);
		if(maxResultData4.isPresent())
			System.out.println("maxResultData4 = "+maxResultData4.get());
		System.out.println("------------");
		
		
		
		
		/* min() & min via reduce */
		List<Integer> numersDatas= Arrays.asList(1,2,3,4,5,6,7,8);
		Optional minResultData = numersDatas.stream().min(Integer::compareTo);
		if(minResultData.isPresent())	
			System.out.println("minResultData = "+minResultData.get());
		
		/* Below line won't give expected result */
		// (0,1) -> 0
		// (0,2) -> 0
		// (0,3) -> 0
		//int  minResultData2 = numersDatas.stream().reduce(0,(a,b) -> a < b ? a : b);
		Optional  minResultData2 = numersDatas.stream().reduce((a,b) -> a < b ? a : b);
		System.out.println("minResultData2 = "+minResultData2.get());
		
		Optional  minResultData3 = numersDatas.stream().reduce(Integer::min);
		if(minResultData3.isPresent())
			System.out.println("minResultData2 = "+minResultData3.get());
		System.out.println("------------");
		
		
		
		
		/* example of limit and skip */
		List<Integer> dataSource= Arrays.asList(1,2,3,4,5,6,7,8);
		List dataSourceRef = dataSource.stream().limit(5).collect(Collectors.toList());
		System.out.println("dataSourceRef = "+dataSourceRef);
		
		
		List dataSourceRefSkip = dataSource.stream().skip(5).collect(Collectors.toList());
		System.out.println("dataSourceRefSkip = "+dataSourceRefSkip);
		System.out.println("------------");
		
		
		
		/* finaAny and findFirst */
		Optional<Instructor> insData = Instructors.getAll().stream().findAny();
		if(insData.isPresent()) {
			System.out.print(insData.get());
		}
		
		Optional<Instructor> insData1 = Instructors.getAll().stream().findFirst();
		if(insData1.isPresent()) {
			System.out.print(insData1.get());
		}
	}
}
