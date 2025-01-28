package com.modernjava.functionalprogramming;

import java.util.function.Consumer;

/* 
public interface java.util.function.Consumer<T> {
	abstract void accept(T);
	default java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T>);
 }
*/
public class ConsumerExample {
	public static void main(String a[]) {
		Consumer<String> c = (x) -> System.out.println(x.length());
		c.accept("Input");
		
		/* Consumer with block statement */
		Consumer<Integer> d = (x) -> {
			System.out.println("x * x = "+x*x);
			System.out.println("x / x = "+x/x);
		};
		d.accept(5);
		
		
		
	}
}
