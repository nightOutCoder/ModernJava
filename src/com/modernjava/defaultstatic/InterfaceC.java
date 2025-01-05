package com.modernjava.defaultstatic;

public interface InterfaceC {
	default void sumC(int a, int b) {
		System.out.println("SumC = "+(a+b));
	}
}
