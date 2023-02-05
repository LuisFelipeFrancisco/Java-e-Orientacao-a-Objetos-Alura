package br.com.alura.test;

import java.util.HashSet;
import java.util.Set;

public class TestStudents {
    
    public static void main(String[] args) {
        
        Set<String> students = new HashSet<>();
        students.add("Student 1");
        students.add("Student 2");
        students.add("Student 3");

        System.out.println(students);

        students.add("Student 3");
        students.add("Student 4");

        System.out.println(students);

        for (String student : students) {
            System.out.println(student);
        }

        //students.add("Student 5");

        boolean isStudent = students.contains("Student 5");

        System.out.println(isStudent);

    }
}
