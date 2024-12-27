package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {

	public static void main(String arg[]) {
		
		/*********** IntConsumer & LongConsumer & DoubleConsumer ***********/
		
		IntConsumer intConsumer = (a) -> System.out.println(a*10);
		intConsumer.accept(10);
		System.out.println("---------------------------------------------------------------------------");
		
		LongConsumer longConsumer = (a) -> System.out.println(a*10L);
		longConsumer.accept(10L);
		System.out.println("---------------------------------------------------------------------------");
		
		DoubleConsumer doubleConsumer = (a) -> System.out.println(a*10);
		doubleConsumer.accept(10.5);
		
		
		/*********** BiConsumer Example ***********/
		System.out.println("---------------------------------------------------------------------------");
		//Printing two numbers
		BiConsumer<Integer,Integer> biConsumer1 = (a,b) -> System.out.println("First is = "+a+" and Second is = "+b);
		biConsumer1.accept(100, 200);
		System.out.println("---------------------------------------------------------------------------");
		
		// Sum of two numbers
		BiConsumer<Integer,Integer> biConsumer2 = (a,b) -> System.out.println("Sum is = "+ (a+b));
		biConsumer2.accept(101, 201);
		System.out.println("---------------------------------------------------------------------------");
		
		/* List of instructor */
		List<Instructor> instructors = Instructors.getAll();
		
		/**Print out name and  gender of instructors **/
		BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("name is : "+ name +" and  gender is : "+ gender);
		instructors.forEach( data -> biConsumer.accept(data.getName(), data.getGender()));
		System.out.println("---------------------------------------------------------------------------");
		
		/**Print out name and  list of courses **/
		BiConsumer<String, List<String>> biConsumerNameAndCourses = (name, courses) -> System.out.println("name is : "+ name +" and  Courses are : "+ courses);
		instructors.forEach( data -> biConsumerNameAndCourses.accept(data.getName(), data.getCourses()));
		System.out.println("---------------------------------------------------------------------------");
		
		/**Print out name and  gender who teaches online **/
		instructors.forEach(data -> {
			if(data.isOnlineCourses())
				biConsumer.accept(data.getName(), data.getGender());
		});
	}
}
