package com.modernjava.lambdaexpression;


public class HelloWorldTraditional implements HelloWorldInterface {

    @Override
    public String sayHelloWorld() {
        return "Hello World!!";
    }

    public static void main(String[] args) {
        HelloWorldTraditional helloWorld = new HelloWorldTraditional();
        System.out.println(helloWorld.sayHelloWorld());
    }
}
