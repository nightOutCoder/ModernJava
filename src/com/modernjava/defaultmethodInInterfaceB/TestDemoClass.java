package com.modernjava.defaultmethodInInterfaceB;

public class TestDemoClass {
    public static void main(String arg[]){
        Child child = new Child();
        child.test();


        /*Example 1*/
        /* It will not throw any compilation error */
        Child objRef= null;
        objRef.show();

         /* It will throw compilation error */
        //A objaRef = null;
        //objaRef.m1();


        
        /*Example 2*/
        /* It will not throw any compilation error */
        Child objRefS= new Child();
        objRef.show();

         /* It will throw compilation error */
        // A objaRef = new Child();
        // objaRef.m1();


        /*Only one way*/
        A.m1();
    }
}
