package com.modernjava.lambdaexpression;

public class Demo2 {
    public static void main(String[] args) {
        Hello2 ob = name -> System.out.println("Hello "+name);
        ob.display("John");


    }
}
