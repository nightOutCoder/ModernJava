package com.modernjava.javaimprovements;

public class SwitchStatementExampleYield {
	/* Java 13
	 * yield in Switch Expression 
	 *
	 */

	 public static void main(String[] args) {
		  int day = 3;
      String dayName = switch (day) {
          case 1 -> {
              yield "Monday";
          }
          case 2 -> {
              yield "Tuesday";
          }
          case 3 -> {
              yield "Wednesday";
          }
          case 4 -> {
              yield "Thursday";
          }
          case 5 -> {
              yield "Friday";
          }
          case 6 -> {
              yield "Saturday";
          }
          case 7 -> {
              yield "Sunday";
          }
          default -> {
              yield "Invalid day";
          }
      };

      System.out.println("The day is: " + dayName);
  }
}