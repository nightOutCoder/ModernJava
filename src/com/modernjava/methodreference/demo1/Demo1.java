package com.modernjava.methodreference.demo1;

public class Demo1 {
    public static void main(String[] args) {


     Hello hello1 = (a,b) -> { // implementation via lambda expression
        int sum = a + b;
        return sum;
     };   

     int result = hello1.test(10,20);
     System.out.println(result);

     Hello hello2 = MyInteger::findSum; // Generic implementation
     result = hello2.test(100, 200);
     System.out.println(result);

     Hello hello3 = Integer::sum; // Built it implementation
     result = hello3.test(100, 250);
     System.out.println(result);

     Hello hello4 = Integer::max; // Built it implementation
     result = hello4.test(100, 250);
     System.out.println("Max -> "+result);

     Hello hello5 = Integer::min; // Built it implementation
     result = hello5.test(100, 250);
     System.out.println("min -> "+result);
    }
}
