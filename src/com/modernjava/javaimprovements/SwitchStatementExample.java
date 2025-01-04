package com.modernjava.javaimprovements;

public class SwitchStatementExample {
	/* Java 12
	 * Switch Expression 
	 *
	 */
	
	public static void main(String arg[]) {
		String month = "oct";
		String quarter = switch (month) {
		case "jan", "feb", "mar" -> "First Quarter";
		case "apr", "mayh", "jun" -> "second Quarter";
		case "oct", "nov", "dec" -> "third Quarter";
		default -> "Unknown";
		};
		System.out.println(quarter);
	}
}
