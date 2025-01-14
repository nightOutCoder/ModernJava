package com.modernjava.defaultmethodInInterfaceC;

public interface A {  
 
    static void m1(){
        System.out.println("A - m1()");
    }

    default void m2(){
        m1();
        System.out.println("A - m2()");
    }

    public static void main(String args[]){
        
    }
} 
