package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestListLessons {

	public static void main(String[] args) {

        Lesson l1 = new Lesson("Revistando as ArrayLists", 21);
        Lesson l2 = new Lesson("Listas de objetos", 20);
        Lesson l3 = new Lesson("Relacionamento de listas e objetos", 15);
        
        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(l1);
        lessons.add(l2);
        lessons.add(l3);

        System.out.println("Before sorting by name:");
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }

        Collections.sort(lessons);

        System.out.println("After sorting by name:");
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }

        lessons.sort(Comparator.comparing(Lesson::getDuration));

        System.out.println("After sorting by duration:");
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }

	}
}
