package com.company.ForEach;

import java.util.ArrayList;
import java.util.List;

public class Java8IteratingListExample {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Harshal Mayee");
        nameList.add("Girish Dalvi");
        nameList.add("Rahul Gonda");
        nameList.add("Karan Gupta");

        // Old Way
        System.out.println("Old Way");
        System.out.println("---------------------------------------------");
        for(String name: nameList){
            System.out.println(name+" ");
        }
        System.out.println("---------------------------------------------");

        // Java8 way
        System.out.println("Java8 way");
        System.out.println("---------------------------------------------");
        nameList.forEach(s -> System.out.println(s+" "));
        System.out.println("---------------------------------------------");
    }
}
