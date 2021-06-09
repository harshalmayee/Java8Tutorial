package com.company.FunctionaInterface.Predicate;

import java.util.function.Predicate;

public class Java8PredicateExample {
    public static void main(String[] args) {
        // Using Anonymous class
        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 100;
            }
        };

        // Using Lambda Expression
        Predicate<Integer> predicateLambda=(integer -> integer > 100);

        boolean greaterCheck = predicateLambda.test(200);
        System.out.println("Is 200 Greater Then 100 :"+greaterCheck);
    }
}
