package com.modernjava.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* 
public interface java.util.function.Predicate<T> {
	abstract boolean test(T);
	default java.util.function.Predicate<T> and(java.util.function.Predicate<? super T>);
	default java.util.function.Predicate<T> negate();
	default java.util.function.Predicate<T> or(java.util.function.Predicate<? super T>);
	static <T> java.util.function.Predicate<T> isEqual(java.lang.Object);
	static <T> java.util.function.Predicate<T> not(java.util.function.Predicate<? super T>);
 }
*/
 
public class PredicateExample {
	public static void main(String arg[]) {
		
		// if number is greater than ten 
		Predicate<Integer> predicate = (i) -> i > 10;
		System.out.println(predicate.test(9));
		System.out.println("---------------------------------------------------------------------------");
		
		// if number > 10 and even
		Predicate<Integer> predicate1 = (i) -> i % 2 == 0;
		System.out.println(predicate.and(predicate1).test(14));
		System.out.println("---------------------------------------------------------------------------");
		
		// if number > 10 or even
		System.out.println(predicate.or(predicate1).test(6));
		System.out.println(predicate.or(predicate1).test(13));
		System.out.println("---------------------------------------------------------------------------");
		
		// if number > 0 && odd
		System.out.println(predicate.and(predicate1.negate()).test(6));
		System.out.println(predicate.and(predicate1.negate()).test(13));
		System.out.println("---------------------------------------------------------------------------");
		
		
		
		/* Predicate with Instructor example */
		List<Instructor> instructors = Instructors.getAll();
		
		/* instructor who teaches online */
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;
		
		/* instructor experience > 10 */
		Predicate<Instructor> p2 = (i) -> i.getYearsOfExperienc() > 10;
		
		/*instructor teaches online*/
		instructors.forEach(data -> {
			if(p1.test(data)) {
				System.out.println(data);
			}
		});
		System.out.println("---------------------------------------------------------------------------");
		
		/*instructor teaches online & experience > 10*/
		instructors.forEach(data -> {
			if(p1.and(p2).test(data)) {
				System.out.println(data);
			}
		});
		System.out.println("---------------------------------------------------------------------------");
		
		
		/* IntPredicate, LongPredicate, DoublePredicate */
		IntPredicate intPredicate = (i) -> i > 100;
		System.out.println(intPredicate.test(101));
		
		LongPredicate longPredicate = (i) -> i > 100L;
		System.out.println(longPredicate.test(101L));
		
		DoublePredicate doublePredicate = (i) -> i > 100.50;
		System.out.println(doublePredicate.test(99.50));
		System.out.println("---------------------------------------------------------------------------");
		
		/* BiPredicate Functional Interface */
	
		/* 
		public interface java.util.function.BiPredicate<T, U> {
			abstract boolean test(T, U);
			default java.util.function.BiPredicate<T, U> and(java.util.function.BiPredicate<? super T, ? super U>);
			default java.util.function.BiPredicate<T, U> negate();
			default java.util.function.BiPredicate<T, U> or(java.util.function.BiPredicate<? super T, ? super U>);
		 }
		*/
		System.out.println("---------------------------------------------------------------------------");
		BiPredicate<Integer,Integer> dataInput = (a,b) -> a==0 && b > 2;
		System.out.println(dataInput.test(0,4));
		
		
		// BiPredicate print name and courses
		BiPredicate<Boolean, Integer> biPredicate = (online, experience) -> online == true && experience > 10;
		BiConsumer<String, List<String>> biConsumer = (a,b) -> System.out.println("Name is = "+ a + ", Courses are = " + b);
		
		instructors.forEach(data -> {
			if(biPredicate.test(data.isOnlineCourses(),data.getYearsOfExperienc())) {
				biConsumer.accept(data.getName(), data.getCourses());
			}
		});
		

		Predicate<Integer> ages = (data) -> data % 2 == 0;
		List<Integer> inputData = new ArrayList<>();
		inputData.add(20);
		inputData.add(21);
		inputData.add(24);
		inputData.add(25);
		System.out.println(inputData);
		inputData.removeIf(ages);
		System.out.println(inputData);
		

		// isEqual - It takes Object as an argument
		Predicate<Integer> isEqualRef = Predicate.isEqual(101);
		boolean result = isEqualRef.test(101);
		System.out.println(result);
		result = isEqualRef.negate().test(101);
		System.out.println(result);
		result = isEqualRef.and(data -> data > 100).test(101);
		System.out.println(result);
	}

}
