package com.modernjava.defaultstaticExampleA;

public interface B {
    default void show(){
        System.out.println("B - Show()");
    }
}
