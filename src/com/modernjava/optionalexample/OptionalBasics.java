package com.modernjava.optionalexample;
import java.lang.StackWalker.Option;
import java.util.Optional;

public class OptionalBasics {
    public static void main(String[] args) {
        Optional<String> myOptional = Optional.empty(); /* Used to create the empty optional object. Instead of null*/

        System.out.println("1. "+myOptional);
        System.out.println("2. "+myOptional.orElse("Test"));
        System.out.println("3. "+myOptional);

        String stringInput = "Testing..";
        Optional<String> strRef = Optional.of(stringInput);
        System.out.println("4. "+strRef);

        /* 
        String stringInput1 = null;
        Optional<String> strRef1 = Optional.of(stringInput1); // with of value must be present. it won't work with null
        System.out.println("5. "+strRef1);
        */

        String stringInput2 = null;
        Optional<String> strRef2 = Optional.ofNullable(stringInput2); /* it could expect null also and create a empty optonal object */
        System.out.println("4. "+strRef2);

        String stringInput3 = "Testing..";
        Optional<String> strRef3 = Optional.ofNullable(stringInput3);
        if(strRef3.isPresent()){
            System.out.println(strRef3.get());
        }
        System.out.println("5. "+strRef3);


        /* filter api */
        String s = null;
        Optional<String> ref = Optional.ofNullable(s);
        Optional<String> ref1 = ref.filter(input -> input.contains("tet"));
        System.out.println("6." +ref1);

        String s1 = "test";
        Optional<String> ref01 = Optional.ofNullable(s1);
        Optional<String> ref2 = ref01.filter(input -> input.contains("te"));
        System.out.println("7.." +ref2);

        String s12 = "test";
        Optional<String> ref012 = Optional.ofNullable(s12);
        Optional<String>  ref22 = ref012.filter(input -> input.contains("tet"));
        System.out.println("8." +ref22);


        /* map api */
        String s13 = "Rest";
        Optional<String> ref013 = Optional.ofNullable(s13);
        Optional<String>  ref23 = ref013.map(input -> input);
        System.out.println("9." +ref23);
        ref23 = ref013.map(input -> input.toUpperCase());
        System.out.println("9." +ref23);
    }
}
