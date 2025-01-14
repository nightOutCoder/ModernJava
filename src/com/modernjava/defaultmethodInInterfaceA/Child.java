package com.modernjava.defaultmethodInInterfaceA;
public class Child implements A {
    public void test(){
        System.out.println("P = "+ P+" Q= "+Q); // Inherited
        m1(); // Overridden
        m2(); // Overridden
        m3(); // Overridden
        A.super.m3(); // Directly calling m3 from A
        m4(); // Inherited
        A.super.m4(); // Directly calling m4 from A
        A.m5(); //
        A.m6(); //
        /* A.super.m5();*/
    }

    @Override
    public void m1() {
        System.out.println("Child m1()");
    }

    @Override
    public void m2() {
        System.out.println("Child m2()");
    }

    @Override
    public void m3(){
        System.out.println("child - m3()");
    }
}
