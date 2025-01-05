package com.modernjava.defaultstatic;

public interface InterfaceA {
	default void sumA(int a, int b) {
		System.out.println("sumA = "+(a+b));
	}
}
