package com.modernjava.optionalexample;

import java.util.NoSuchElementException;
import java.util.Optional;


public class OptionalBasics1 {
    public static void main(String[] args) {
        
        String str = "Testing";
        Optional<Optional<String>> myString = Optional.of(Optional.ofNullable(str));

        System.out.println("1. "+myString);
        System.out.println("2. "+myString.map(data -> data));
        System.out.println("3. "+myString.flatMap(data -> data));
        System.out.println("4. "+myString.map(data -> data.map(data1 -> data1.toUpperCase())));
        Optional<Optional<String>> myString1 = myString.map(data -> data.map(data1 -> data1.toUpperCase()));
        System.out.println("5. "+myString1);
        Optional<String> myString2 = myString.flatMap(data -> data.map(data1 -> data1.toUpperCase()));
        System.out.println("6. "+myString2);

        /************* Second Example ******************/

        String stringData = "json";
         Optional<Optional<Optional<String>>> response = Optional.of(Optional.of(Optional.of(stringData)));
         System.out.println("response : "+ response);
         Optional<Optional<Optional<String>>> ref = response.map(data -> data);
         System.out.println("ref :"+ref);
         Optional<Optional<Optional<String>>> upperCase = response.map(data -> data.map(i ->i.map(j -> j.toUpperCase())));
         System.out.println("rupperCasef :"+upperCase);
         Optional<Optional> re = response.flatMap(data -> data.map(i ->i.map(j -> j.toUpperCase())));
         System.out.println("re:"+re);
         Optional<String> re1 = response.flatMap(data -> data.flatMap(i ->i.map(j -> j.toUpperCase())));
         System.out.println("re1:"+re1);


        /************* orElse ******************/
         String stRef = "jsondata";
         Optional<String> myOpts = Optional.ofNullable(stRef);
         System.out.println(myOpts);
         System.out.println(myOpts.orElse("ElseTest"));
         stRef = null;
         Optional<String> myOpts1 = Optional.ofNullable(stRef);
         System.out.println(myOpts1.orElse("ElseTest"));

        /************* orElseGet ******************/

        String stRefs = null;
        Optional<String> myOptRef = Optional.ofNullable(stRefs);
        System.out.println(myOptRef.orElseGet(() -> "Ok JSON")); /*The only difference with orElse is here we have lambda in hand to perform anything */

        /************* orElseThrow ******************/

        String stRefence = null;
        Optional<String> stRefenceData = Optional.ofNullable(stRefence);
        System.out.println(stRefenceData.orElseThrow(NoSuchElementException::new)); /* If optiona list empty then throw mentioned exception */
    }
}
