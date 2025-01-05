package com.modernjava.defaultstatic;

public class MultipleInheritanceDebuggingExample implements InterfaceA, interfaceD {

	/*Here if we not defined our method here then compiler will throw compilation error */
	
	public void sumA(int a, int b) {
		System.out.println("sumA = "+(a+b));
	}
}
