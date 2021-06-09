package com.company.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8CollectorsExample {
    public static void main(String[] args) {
        List intList = Arrays.asList(10,20,30,40,50);
        List nameList = Arrays.asList("Arpit","John","Martin");
        // Counting
        long count = (long) intList.stream().collect(Collectors.counting());
        System.out.println("Count is :"+count);

        // Averaging Int
        Double average1 = (Double) intList.stream().collect(Collectors.averagingInt(value -> (int) value));
        System.out.println("Average is :"+average1);

        Double average2 = (Double)intList.stream().collect(Collectors.averagingInt(value -> (int)value * (int)value));
        System.out.println("Average2 is :"+average2);

        // Summing Int
        int sum1 = (int) intList.stream().collect(Collectors.summingInt(value -> (int) value));
        System.out.println("Summing int value is :"+sum1);

        int sum2 = (int) intList.stream().collect(Collectors.summingInt(value -> (int)value * (int)value));
        System.out.println("Summing int 2 value is :"+sum2);

        // CollectingAndThen
        int result= (int) intList.stream().collect(Collectors.collectingAndThen(Collectors.summingInt(value -> (int) value), result1->result1/2));
        System.out.println("Collecting and Then Result is :"+result);

        // Joining
        String stringWithHyphen = (String) nameList.stream().collect(Collectors.joining("-"));
        System.out.println("String with Hyphen :"+stringWithHyphen);

        String stringWithHyphenPrefixSuffix = (String) nameList.stream().collect(Collectors.joining("-", "==", "=="));
        System.out.println("String with Hyphen,Prefix and Suffix :"+stringWithHyphenPrefixSuffix);


    }
}
