package com.modernjava.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

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
        

        System.out.println("------------Ways of Creating Stream ---------------");
        /* Other way of creating a stream */
        Stream<Integer> myStream = Stream.empty();
         myStream.forEach(System.out::println);

         myStream = Stream.of();
         myStream.forEach(System.out::println);

         List<Integer> listS1 = Arrays.asList(1,2,3);
         List<Integer> listS2 = Arrays.asList(101,201,301);
         Stream<List<Integer>> resultStream = Stream.of(listS1,listS2);
         resultStream.forEach(System.out::println);

         System.out.println("---------------------------");
         Stream<Integer> sInteger1 = Stream.of(102,104,106);
         List<Integer> integer = Arrays.asList(1001,2002);
         Stream<Integer> sInteger2 = integer.stream();
         Stream<Integer> intStream = Stream.concat(sInteger1, sInteger2);
         intStream.forEach(System.out::println);

         System.out.println("---------------------------");
         Stream<Integer> result = Stream.iterate(13, input -> input + 1).limit(5);
         result.forEach(System.out::println);

         System.out.println("---------------------------");
         Stream<Integer> results = Stream.generate(() -> (new Random()).nextInt(10)).limit(5);
         results.forEach(System.out::println);

         System.out.println("------------reduce terminal example ---------------");
         List<Integer> dataResult = Arrays.asList(12,10,2);
         int sumResult = dataResult.stream().reduce(0,(a,b) -> (a+b));
         System.out.println(sumResult);
         int sumResult1 = dataResult.stream().reduce(0,Integer::sum);
         System.out.println(sumResult1);
         int sumResult2 = dataResult.stream().reduce(1,(a,b) -> a*b);
         System.out.println(sumResult2);
         int sumResult3 = dataResult.stream().reduce((a,b) -> b).orElse(-1); // Return last value. And Return -1 in case stream is empty
         System.out.println(sumResult3);
         Optional<Integer> mySum = dataResult.stream().reduce((a,b) -> a+b); /* In this case there is no offset */
         mySum.ifPresent(System.out::println);
         Optional<Integer> mynum1 = dataResult.stream().findFirst();
         mynum1.ifPresent(System.out::println);
         Optional<Integer> mynum2 = dataResult.stream().findAny();
         mynum2.ifPresent(System.out::println);
    }
}
