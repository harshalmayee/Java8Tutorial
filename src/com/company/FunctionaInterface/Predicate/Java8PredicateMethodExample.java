package com.company.FunctionaInterface.Predicate;

import java.util.function.Predicate;

public class Java8PredicateMethodExample {
    public static void main(String[] args) {
      boolean greaterCheck=greaterCheck(200,integer -> integer > 100);
      System.out.println("Passing Predicate as Method : "+greaterCheck);
    }

    public static  boolean greaterCheck(int number, Predicate<Integer> predicate){
        return predicate.test(number);
    }
}
