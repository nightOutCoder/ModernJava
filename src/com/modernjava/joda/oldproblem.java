package com.modernjava.joda;

import java.util.Date;

public class oldproblem {
    /*
    * Problem with Date use cases until java 7: -
    * 
    * Month start with zero
    * Got get proper years, always we need to subtract 1900
    * oth Date and Calendar were mutable objects. It is not thread safe
    * 
    */
        public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Date myDate = new Date(2021,8,22,1,50); /*Month start with zero. Here month would be wrong*/
        System.out.println(myDate);

        Date myDate1 = new Date(2021-1900,8,22,1,50); /*Month start with zero */
        System.out.println(myDate1);
    }
}
