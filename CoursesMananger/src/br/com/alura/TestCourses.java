package br.com.alura;


public class TestCourses {
    public static void main(String[] args) {
        
        Course javaCollections = new Course("Java Collections", "Paulo Silveira");

        javaCollections.add(new Lesson("Working with ArrayList", 21));
        javaCollections.add(new Lesson("Creating a class", 20));
        javaCollections.add(new Lesson("Modeling classes", 24));

        javaCollections.getLessons().add(new Lesson("Working with ArrayList", 21)); // This line will throw an exception
       
        System.out.println(javaCollections.getLessons());

    }
    
}
