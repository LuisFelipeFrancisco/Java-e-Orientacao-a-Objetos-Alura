package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCourses {
    public static void main(String[] args) {
        
        Course javaCollections = new Course("Java Collections", "Paulo Silveira");

        javaCollections.add(new Lesson("Working with ArrayList", 21));
        javaCollections.add(new Lesson("Creating a class", 20));
        javaCollections.add(new Lesson("Modeling classes", 24));

        //javaCollections.getLessons().add(new Lesson("Working with ArrayList", 21)); // This line will throw an exception
       
        List<Lesson> immutableLessons = javaCollections.getLessons();
        System.out.println(immutableLessons);

        List<Lesson> mutableLessons = new ArrayList<>(immutableLessons);

        Collections.sort(mutableLessons);
        System.out.println(mutableLessons);

        System.out.println(javaCollections.getTotalTime());

        System.out.println(javaCollections);

        System.out.println("-------------------------------------------------");

        Student student1 = new Student("Felipe", 12345);
        Student student2 = new Student("Student 2", 54321);
        Student student3 = new Student("Student 3", 67890);

        javaCollections.enroll(student1);
        javaCollections.enroll(student2);
        javaCollections.enroll(student3);

        System.out.println("Students enrolled: ");
        javaCollections.getStudents().forEach(student -> {
            System.out.println(student);
        });

        Student felipe = new Student("Felipe", 12345);
        System.out.println("Felipe is enrolled? " + javaCollections.isStudentEnrolled(felipe));

        System.out.println("Felipe equals Felipe? " + felipe.equals(student1));

    }
    
}