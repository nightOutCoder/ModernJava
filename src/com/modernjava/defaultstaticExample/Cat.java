package com.modernjava.defaultstaticExample;

public class Cat  implements Animal {

    @Override
    public void eating() {
        System.out.println("cat is eating");
    }

    @Override
    public void sleeping() {
        System.out.println("cat is sleeping");
    }

    /* we can override the defualt method in sub class */
    @Override
    public void running() {
        System.out.println("Cat is running - via override");
    }
    
}
