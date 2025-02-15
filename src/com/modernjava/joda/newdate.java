package com.modernjava.joda;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class newdate {
    public static void main(String[] args) {
    /*
     * joda date time api is added from java 8 in package java.time
     * 
     * Three ways to get Date object
     * 
    */
    LocalDate now = LocalDate.now();
    System.out.println(now);

    LocalDate now1 = LocalDate.parse("2021-01-01"); /*Always add zero before in case of single digit */
    System.out.println(now1);
    System.out.println(now1.getYear());
    System.out.println(now1.getDayOfYear());
    System.out.println(now1.getMonth());

    LocalDate now2 = LocalDate.of(2026,3,31);
    System.out.println(now2);


    System.out.println("------------------------------------");

    LocalDateTime nowDateTime = LocalDateTime.now();
    System.out.println(nowDateTime);
    System.out.println(nowDateTime.plusHours(3)); /*It is immutable*/
    nowDateTime = nowDateTime.plusHours(3);
    System.out.println(nowDateTime);
    nowDateTime = nowDateTime.plusMonths(2);
    System.out.println(nowDateTime);

    LocalDateTime nowDateTime1 = LocalDateTime.parse("2021-08-22T09:14:46");
    System.out.println(nowDateTime1);

    LocalDateTime nowDateTime2 = LocalDateTime.of(2021,8,22,2,10,45);
    System.out.println(nowDateTime2);

    System.out.println("------------------------------------");
    
    }
}
