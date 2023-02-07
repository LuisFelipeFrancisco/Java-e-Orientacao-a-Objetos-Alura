import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course("Python", 45));
        courses.add(new Course("JavaScript", 150));
        courses.add(new Course("Java 8", 113));
        courses.add(new Course("C", 55));

        /*
         * courses.sort(Comparator.comparing(Course::getStudents));
         * System.out.println(courses);
         */
        System.out.println("All courses:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }

        System.out.println("Courses with more than 50 students:");
        courses.stream()
                .filter(c -> c.getStudents() > 50)
                .map(Course::getName)
                .forEach(System.out::println);

        System.out.println("Find first course with more than 50 students:");
        courses.stream()
                .filter(c -> c.getStudents() > 50)
                .map(Course::getName)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("Average number of students in all courses:");
        courses.stream()
                .mapToInt(Course::getStudents)
                .average()
                .ifPresent(System.out::println);

        List<String> coursesFilter = courses.stream()
                .filter(c -> c.getStudents() > 50)
                .map(Course::getName)
                .collect(Collectors.toList());
        System.out.println(coursesFilter);

        System.out.println("------------------ Date and Time ------------------");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(1994, Month.JANUARY, 31);

        int years = today.getYear() - birthday.getYear();
        System.out.println(years);

        Period period = Period.between(birthday, today);
        System.out.println(period.getYears());

        System.out.println(today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);

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