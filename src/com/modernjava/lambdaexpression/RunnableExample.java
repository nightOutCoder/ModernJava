package com.modernjava.lambdaexpression;


public class RunnableExample {
    public static void main(String[] args) {
        // Runnable traditional way
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Traditioanl: " + sum);
            }
        };
        new Thread(r).start();


        // Implement using lambda
        Runnable r1 = () -> {
          int sum = 0;
          for (int i = 0; i < 10; i++) {
              sum += i;
          }
          System.out.println("Lambda: " + sum);
        };
        new Thread(r1).start();


        // Implement using Thread with lambda
        new Thread( ()-> {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
            System.out.println("Thread Lambda: " + sum);
            }).start();
    }
}
