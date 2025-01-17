package com.modernjava.lambdaexpression;

@FunctionalInterface
public interface Hello1 {

    void display();

    default void m1(){
        System.out.println("Hello - m1()");
    }

    static void m2(){
        System.out.println("Hello - m2()");
    }
} 