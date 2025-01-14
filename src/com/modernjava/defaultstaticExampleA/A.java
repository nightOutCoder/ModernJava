package com.modernjava.defaultstaticExampleA;

public interface A {  
    default void show(){
        System.out.println("A - Show()");
    }
} 
