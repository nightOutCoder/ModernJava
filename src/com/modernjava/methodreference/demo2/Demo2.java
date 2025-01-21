package com.modernjava.methodreference.demo2;

public class Demo2 {
    public static void main(String[] args) {


     Hello hello1 = (a,b) -> { // implementation via lambda expression
        int sum = a + b;
        return sum;
     };   

     int result = hello1.test(10,20);
     System.out.println(result);

     MyInteger ref =new MyInteger();
     Hello hello2 = ref::findSum; // Generic implementation

     result = hello2.test(100, 200);
     System.out.println(result);
    }
}
