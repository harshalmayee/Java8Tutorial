package com.company.FunctionaInterface.Predicate;

import java.util.function.Predicate;

public class Java8PredicateAndExample {

    public static void main(String[] args) {
        // AND Predicate
        Predicate<Integer> predicate1 = integer -> integer > 100;
        Predicate<Integer> predicate2 = integer -> integer < 300;

        Predicate<Integer> andPredicate = predicate1.and(predicate2);
        boolean rangeCheck = andPredicate.test(200);
        System.out.println("200 lies between 100 and 300 :"+rangeCheck);

        // OR Predicate
        Predicate<Integer> predicate3 = integer -> integer > 100;
        Predicate<Integer> predicate4 = integer -> integer < 50;

        Predicate<Integer> orPredicate = predicate3.or(predicate4);
        boolean rangecheck1 = orPredicate.test(30);
        System.out.println("(30 > 100) OR (30 < 50)"+rangecheck1);

        // Negate Predicate
        // it will be i -> i < 100
        Predicate<Integer> negatePredicate = predicate1.negate();
        boolean negateCheck = negatePredicate.test(30);
        System.out.println("30 is less then 100 :"+negateCheck);

        // isEqual
        Predicate<String> predicateString = Predicate.isEqual("test1");
        System.out.println(predicateString.test("test1"));
        System.out.println(predicateString.test("test2"));
    }
}
