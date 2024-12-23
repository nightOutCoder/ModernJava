package com.modernjava.lambdaexpression;


public class HelloWorldLambda {
    public static void main(String[] args) {
        // implementing sayHelloWorld using lambda

        HelloWorldInterface helloWorld = () -> "Hello World";

        System.out.println(helloWorld.sayHelloWorld());
    }
}
