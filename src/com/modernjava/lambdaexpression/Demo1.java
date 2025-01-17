package com.modernjava.lambdaexpression;

public class Demo1 {
    public static void main(String[] args) {
        Hello1 ob = () -> {
            System.out.println("Test");
        };
        ob.display();

        Hello1 obRef = () -> System.out.println("Test");
        obRef.display();

        obRef.m1();
        // obRef.m2(); /* via ref we can not call static method */
        Hello1.m2();
    }
}
