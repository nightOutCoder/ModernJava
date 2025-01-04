package com.modernjava.javaimprovements;

public class SwitchStatement {

	public static void main(String arg[]) {
		String month = "oct";
		String quarter="";
		switch(month) {
		case "jan":
			quarter = "First Quarter";
			break;
		case "apr":
			quarter = "Second Quarter";
			break;
		case "oct":
			quarter = "Fourth Quarter";
			break;
		}
		System.out.println(quarter);
	}
}
