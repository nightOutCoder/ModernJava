package com.modernjava.defaultstatic;

public interface interfaceD {
	default void sumA(int a, int b) {
		System.out.println("sumA from interfaceD = "+(a+b));
	}
}
