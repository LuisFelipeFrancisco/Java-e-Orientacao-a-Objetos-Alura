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

    }
    
}