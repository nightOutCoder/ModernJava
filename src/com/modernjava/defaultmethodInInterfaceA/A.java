package com.modernjava.defaultmethodInInterfaceA;

public interface A {  

    int P = 101;
    public final static int Q =102;

    public abstract void m1();
    public abstract void m2();

    default void m3(){
        System.out.println("A - m3()");
    }

    default void m4(){
        System.out.println("A - m4()");
    }
 
    static void m5(){
        System.out.println("A - m5()");
    }

    static void m6(){
        System.out.println("A - m6()");
    }
} 
