package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class VariableScope {
	public static void main(String arg[]) {
		int a = 10; // local variable
		//IntConsumer intConsume = (a) -> System.out.println(a*10); /* compiler error */
		
		int k =0;
		List<Instructor> instructors = Instructors.getAll();
		instructors.forEach(data ->{
			System.out.println(k++); //Local variable k defined in an enclosing scope must be final or effectively final
		});
		k = k-1; // compilation error
		
		
		
		
		
	}
}
