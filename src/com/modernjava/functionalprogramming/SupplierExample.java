package com.modernjava.functionalprogramming;

import java.util.function.Supplier;
/* 
public interface java.util.function.Supplier<T> {
	public abstract T get();
  }
*/
public class SupplierExample {
	public static void main(String arg[]) {
		Supplier<Integer> supplier = () -> (int)(Math.random() * 100);
		System.out.println(supplier.get());
		System.out.println(supplier.get());

		Supplier<String> stringGet = () -> "hello";
		System.out.println(stringGet.get());
	}
}
