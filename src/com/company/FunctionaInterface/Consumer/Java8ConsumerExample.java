package com.company.FunctionaInterface.Consumer;

import com.company.FunctionaInterface.Predicate.FilterListPredicate.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8ConsumerExample {
    public static void main(String[] args) {
        // accept() method
        Consumer<String> consumer=s -> System.out.println(s);
        consumer.accept("Arpit");

        // default andThen() method
        Consumer<String> lowercase = s -> System.out.println(s.toLowerCase());
        Consumer<String> uppercase = s -> System.out.println(s.toUpperCase());
        // Composite consumer. We are calling accept method on composite consumer
        Consumer<String> result = lowercase.andThen(uppercase);
        result.accept("Arpit");

        // For Each Example
        List<Student> studentList = createStudentList();
        // Creating consumer for student object which will be used in for each method of list
        Consumer<Student> studentConsumer = student -> System.out.println(student);
        studentList.forEach(studentConsumer);
    }

    public static List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "Arpit", "M", 19);
        Student s2 = new Student(2, "John", "M", 17);
        Student s3 = new Student(3, "Mary", "F", 14);
        Student s4 = new Student(4, "Martin", "M", 21);
        Student s5 = new Student(5, "Monica", "F", 16);
        Student s6 = new Student(6, "Ally", "F", 20);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        return studentList;
    }
}
