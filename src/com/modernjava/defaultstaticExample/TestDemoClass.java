package com.modernjava.defaultstaticExample;

public class TestDemoClass {
    public static void main(String arg[]){
        Dog dog = new Dog();
        dog.running(); 
        dog.thinking(); // inherited default method
        dog.eating();
        dog.sleeping();

        System.out.println("-------------------------");
        
        Cat cat = new Cat();
        cat.running(); // inherited default method
        cat.thinking(); 
        cat.eating();
        cat.sleeping(); 
    }
}
