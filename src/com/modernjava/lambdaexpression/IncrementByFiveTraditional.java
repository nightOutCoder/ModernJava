package com.modernjava.lambdaexpression;


public class IncrementByFiveTraditional implements IncrementByFiveInterface {

    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveInterface i = new IncrementByFiveTraditional();
        System.out.println(i.incrementByFive(6));
    }
}
