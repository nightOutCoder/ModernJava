package com.modernjava.methodreference.demo3;

public class Demo3 {
    public static void main(String[] args) {


     Hello hello1 = (a,b,c,d) -> { // implementation via lambda expression
        Course course = new Course(a,b,c,d);
        return course;
     };   
     System.out.println(hello1);

     Course result = hello1.test(101,"MS",12000,"John");
     System.out.println(result);
  

     
     Hello ref =Course::new; // No clarity about which consturctor to invoke
     result = ref.test(102,"DevOps",11000,"Rony"); // Only SAM signature one get called
     System.out.println(result);
     System.out.println(ref);
    }
}
