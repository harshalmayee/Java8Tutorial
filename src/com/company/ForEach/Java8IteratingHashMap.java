package com.company.ForEach;

import java.util.HashMap;

public class Java8IteratingHashMap {
    public static void main(String[] args) {
        HashMap<String,String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("India","New Delhi");
        countryCapitalMap.put("Pakistan","Islamabad");
        countryCapitalMap.put("USA","WashingtonDC");
        countryCapitalMap.put("China","Beijing");

        // Old Way Iterating using KeySet()
        System.out.println("Iterating Using keySet() and for each loop");
        System.out.println("---------------------------------------------");
        for(String countrykey:countryCapitalMap.keySet()){
            System.out.println("Country :"+countrykey+" and Capital :"+countryCapitalMap.get(countrykey));
        }
        System.out.println("---------------------------------------------");

        // New way Iterating using Java8 ForEach
        System.out.println("Iterating Using Java 8");
        System.out.println("---------------------------------------------");
        countryCapitalMap.forEach((k,v)-> System.out.println("Country :"+k+" and Capital :"+v));
        System.out.println("---------------------------------------------");
    }
}
