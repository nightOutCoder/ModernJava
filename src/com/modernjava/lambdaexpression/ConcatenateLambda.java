package com.modernjava.lambdaexpression;


public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenate = (a,b) -> a +" "+ b;
        System.out.println(concatenate.concatenate("Hello","Worlds"));
    }
}
