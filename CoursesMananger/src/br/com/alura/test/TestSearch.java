package br.com.alura.test;

import br.com.alura.models.*;

public class TestSearch {

    public static void main(String[] args) {
        Course javaCollections = new Course("Java Collections", "Paulo Silveira");

        javaCollections.add(new Lesson("Working with ArrayList", 21));
        javaCollections.add(new Lesson("Creating a class", 20));
        javaCollections.add(new Lesson("Modeling classes", 24));

        Student student1 = new Student("Felipe", 12345);
        Student student2 = new Student("Student 2", 54321);
        Student student3 = new Student("Student 3", 67890);

        javaCollections.enroll(student1);
        javaCollections.enroll(student2);
        javaCollections.enroll(student3);

        System.out.println("Who is the student with the registration number 12345?");
        Student student = javaCollections.searchStudent(12345);
        System.out.println(student);
        
    }
    
}
