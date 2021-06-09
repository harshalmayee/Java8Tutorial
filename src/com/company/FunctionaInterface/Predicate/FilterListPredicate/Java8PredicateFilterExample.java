package com.company.FunctionaInterface.Predicate.FilterListPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8PredicateFilterExample {

    public static void main(String[] args) {
      List<Student> students = createStudentList();

      // Filter all male having age > 18
      Predicate<Student> predicate1 = student -> student.getGender().equalsIgnoreCase("M") &&
                                                 student.getAge() > 18;

      List<Student> students1 = filterStudents(students,predicate1);
      System.out.println("Male Students having age > 18 : "+students1);

      // Filter all female students having age < 18
      Predicate<Student> predicate2 = student -> student.getGender().equalsIgnoreCase("F") &&
                student.getAge() < 18;

      List<Student> students2 = filterStudents(students,predicate2);
      System.out.println("Female Students having age < 18 : "+students2);

      // Filter based on name
      Predicate<Student> predicate3 = student -> student.getName().equalsIgnoreCase("John");
      Student student = students.stream()
              .filter(predicate3)
              .findAny()
              .orElse(new Student());
      System.out.println("Student with name John :"+student);


    }

    public static List<Student> filterStudents(List<Student> students, Predicate<Student> predicate){
        return students.stream().filter(predicate).collect(Collectors.toList());
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
