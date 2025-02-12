package com.modernjava.parallelstream;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(1,2,3,4,5,7,8,9);
     
        System.out.println("---------------------------");
        numsList.stream().forEach(System.out::println);

        System.out.println("---------------------------");
        numsList.parallelStream().forEach(System.out::println);
    }
}
