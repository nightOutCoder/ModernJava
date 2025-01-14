package com.modernjava.defaultstaticExampleC;

public interface B extends A {

    /* Try with case via commenting m1 */
    default void m1(){
        System.out.println("B - m1()");
    }

    default void m2(){
        System.out.println("B - m2()");
        m1();
    }
}
