package com.modernjava.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        List<Integer> numsList = Arrays.asList(1,2,3,4,5,7,8,9);
        numsList.stream().filter(data -> data % 2 != 0).map(data -> data * data).forEach(System.out::println);

        System.out.println("---------------------------");
        numsList.stream().forEach(System.out::println);

        System.out.println("---------------------------");
        numsList.parallelStream().forEach(System.out::println);

        System.out.println("---------------------------");
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(11,22,33);
        List<List<Integer>> mylist = Arrays.asList(list1,list2);
        mylist.stream().forEach(System.out::println);
        System.out.println("---------------------------");
        mylist.stream().map(Collection::stream).flatMap(data -> data).forEach(System.out::println);

        System.out.println("---------------------------");
        numsList.stream().skip(2).limit(4).forEach(System.out::println);

        System.out.println("---------------------------");
        List<Integer> numsList1 = Arrays.asList(1,2,3,4,5,7,8,9,9,9,9);
        numsList1.stream().distinct().filter(x -> x > 4).peek(System.out::println).map(data -> data * 2).sorted().forEach(System.out::println);
        
    }
}
