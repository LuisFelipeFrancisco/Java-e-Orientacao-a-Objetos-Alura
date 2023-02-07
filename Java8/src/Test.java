import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course("Python", 45));
        courses.add(new Course("JavaScript", 150));
        courses.add(new Course("Java 8", 113));
        courses.add(new Course("C", 55));

        /* courses.sort(Comparator.comparing(Course::getStudents));
        System.out.println(courses); */

        courses.stream()
            .filter(c -> c.getStudents() > 50)
            .map(Course::getStudents)
            .forEach(System.out::println);
    }
}

class Course {
    private String name;
    private int students;

    public Course(String name, int students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getStudents() {
        return students;
    }
}