package com.modernjava.defaultstaticExampleA;

public class Child implements A,B {
    
    /* No inherited show method only overridden method */
    @Override
    public void show(){
        System.out.println("Child - Show()");
    }
    
    public void test(){
        show();
        A.super.show();
        B.super.show();
    }
}
