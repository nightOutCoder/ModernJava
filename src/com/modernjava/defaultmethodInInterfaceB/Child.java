package com.modernjava.defaultmethodInInterfaceB;
public class Child implements A, B {
    public void test(){
        m1();
        A.m1();
        B.m1();
    }
    
    /* it is not overriding, it is a new local m1 in child class*/
    static void m1(){
        System.out.println("Child - m1()");
    }

    static void show(){
        System.out.println("Child - show()");
    }

}
