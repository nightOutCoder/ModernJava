package com.modernjava.lambdaexpression;


public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFiveInterface obj = (x) -> x + 5;
        System.out.println(obj.incrementByFive(7));
    }
}
