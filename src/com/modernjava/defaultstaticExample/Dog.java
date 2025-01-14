package com.modernjava.defaultstaticExample;

public class Dog  implements Animal {

    @Override
    public void eating() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleeping() {
        System.out.println("Dog is sleeping");
    }

    /* we can override the defualt method in sub class */
    @Override
    public void thinking() {
        System.out.println("Dog is thinking - via override");
    }
    
}
