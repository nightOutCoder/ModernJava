package com.modernjava.defaultstaticExample;

public interface Animal {  
    void eating();

    public abstract void sleeping();

    default void running(){
        System.out.println("Animal is running");
    }

    default void thinking(){
        System.out.println("Animal is thinking");
    }
} 
