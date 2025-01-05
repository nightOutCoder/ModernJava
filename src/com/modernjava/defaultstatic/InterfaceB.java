package com.modernjava.defaultstatic;

public interface InterfaceB extends InterfaceA {
	default void sumB(int a, int b) {
		System.out.println("SumB = "+(a+b));
	}
	
	default void sumA(int a, int b) {
		System.out.println("From Interface B - SumA = "+(a+b));
	}
}
