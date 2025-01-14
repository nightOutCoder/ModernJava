package com.modernjava.defaultstaticExampleB;

public interface A {  
    default void m1(){
        System.out.println("A - m1()");
    }

    default void m2(){
        m1();
        System.out.println("A - m2()");
    }

    /*A default method cannot override a method from java.lang.Object*/
    /* 
        default boolean equals(Object obj){
            System.out.println("A - equals()");
        }
    */
} 
