package com.company.FunctionaInterface.Supplier;

import com.company.FunctionaInterface.Predicate.FilterListPredicate.Student;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Java8SupplierExample {

    public static void main(String[] args) {

        // String as supplier
        Supplier<String> supplier = ()->"Arpit";
        System.out.println(supplier.get());

        // Object as supplier
        Supplier<Student> studentSupplier = () -> new Student(1,"Arpit","M",19);
        System.out.println(studentSupplier.get());

        // Generate random numbers between 0-10
        Supplier<Integer> randomNumSupplier = ()->new Random().nextInt(10);
        Stream.generate(randomNumSupplier)
                .limit(5)
                .forEach(System.out :: println);
    }
}
