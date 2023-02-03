package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestList {
	public static void main(String[] args) {
		String lesson1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String lesson2 = "Apache Camel: Transforme seus dados";
		String lesson3 = "Certificação Java SE 8 Programmer I: Preparação para a prova 1Z0-808";

		ArrayList<String> lessons = new ArrayList<String>();
		lessons.add(lesson1);
		lessons.add(lesson2);
		lessons.add(lesson3);
		
		System.out.println(lessons);
		lessons.remove(1);
		System.out.println(lessons);

		System.out.println("Printing all lessons using a for loop");
		for (String lesson : lessons) {
			System.out.println(lesson);
		}

		System.out.println("Printing a desired class using .get()");
		System.out.println(lessons.get(1));
		
		lessons.add("Apache Camel: Transforme seus dados");
		System.out.println("Before sorting");
		for (String lesson : lessons) {
			System.out.println(lesson);
		}
		Collections.sort(lessons);
		System.out.println("After sorting");
		for (String lesson : lessons) {
			System.out.println(lesson);
		}
	}

}

/*
 * Lists are ordered collections of elements. Lists allow duplicate elements.
 * Lists are indexed, meaning that each element in the list has a position.
 * .add() method adds an element to the list.
 * .get() method returns the element at the specified position in the list.
 * .remove() method removes the element at the specified position in the list.
 * Collections.sort() method sorts the elements of the list in ascending order.
 */