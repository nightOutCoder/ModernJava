package com.modernjava.functionalprogramming;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String arg[]) {
		
		Supplier<Integer> supplier = () -> (int)(Math.random() * 100);
		System.out.println(supplier.get());
		System.out.println(supplier.get());
	}
}
