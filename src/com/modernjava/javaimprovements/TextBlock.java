package com.modernjava.javaimprovements;

public class TextBlock {
	/* Text Block Java 13 */
	public static void main(String args[]) {
		String s1 = """
				Hello worlds
				using
				text blocks !""";
		
		System.out.println(s1);
		
		System.out.println("---------------------------");
		
		String s2 = """
				{
				x :"xx",
				y : "yy"
				}
				""";
		System.out.println(s2);
	}
}
