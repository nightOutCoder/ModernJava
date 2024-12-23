package com.modernjava.lambdaexpression;


public class ConcatenateTraditional implements ConcatenateInterface{
    @Override
    public String concatenate(String first, String second) {
        return first +" "+ second;
    }
    public static void main(String[] args) {
        ConcatenateInterface concatenate = new ConcatenateTraditional();
        System.out.println(concatenate.concatenate("Hello", "System"));
    }
}
