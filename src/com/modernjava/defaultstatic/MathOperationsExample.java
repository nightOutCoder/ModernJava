package com.modernjava.defaultstatic;

public class MathOperationsExample implements Calculator {
	
	public static void main(String args[]) {
		MathOperationsExample object = new MathOperationsExample();
		System.out.println(object.sum(2, 4));
		//System.out.println(object.divide(7, 2));
		
		// our implementation using lambda expression for sum and divide
		Calculator cal = (a,b) -> a % b;
		System.out.println(cal.sum(5, 6));
		
		System.out.println(object.subtract(4, 1));
		System.out.println(Calculator.multiply(4, 5));
	}
	
	@Override
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

//	@Override
//	public int divide(int num1, int num2) {
//		return num1/num2;
//	}

}
