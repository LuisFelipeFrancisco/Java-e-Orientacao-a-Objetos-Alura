package br.com.alura.models;

public class Lesson implements Comparable<Lesson> {

    private String name;
    private int duration;

    public Lesson(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "[Lesson: " + this.name + ", " + this.duration + " minutes]";
    }

    @Override
    public int compareTo(Lesson anotherCourse) {
        return this.name.compareTo(anotherCourse.name);
    }
}
