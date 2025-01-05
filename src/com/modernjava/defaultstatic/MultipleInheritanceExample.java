package com.modernjava.defaultstatic;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {
	public static void main(String arg[]) {
		MultipleInheritanceExample ob = new MultipleInheritanceExample();
		ob.sumA(2, 4); /* Resolve to Child */
		ob.sumB(6, 3);
		ob.sumC(1, 3);
	}
	
	/* Resolve : implemented class first
	 * Resolve : the sub interface that extends the interface 
	 * 
	 */
//	public void sumA(int a, int b){
//		System.out.println("From MultipleInheritanceExample - sumA = "+(a+b));
//	}
}
