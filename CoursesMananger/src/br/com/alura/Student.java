package br.com.alura;

public class Student {
    
    private String name;
    private int number;

    public Student(String name, int number) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Enrollment " + number + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Student otherStudent = (Student) obj;
        return this.name.equals(otherStudent.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
