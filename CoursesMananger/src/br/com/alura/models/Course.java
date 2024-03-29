package br.com.alura.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Course {
    
        private String name;
        private String instructor;
        private List<Lesson> lessons = new ArrayList<>();
        private Set<Student> students = new HashSet<>();
        private Map<Integer, Student> matriculationIndex = new HashMap<>();
    
        public Course(String name, String instructor) {
            this.name = name;
            this.instructor = instructor;
        }
    
        public String getName() {
            return name;
        }
    
        public String getInstructor() {
            return instructor;
        }
    
        public List<Lesson> getLessons() {
            return Collections.unmodifiableList(lessons);
        }
        
        public void add(Lesson lesson) {
            this.lessons.add(lesson);
        }

        public int getTotalTime() {
            return this.lessons.stream().mapToInt(Lesson::getDuration).sum();
        }

        @Override
        public String toString() {
            return "[Course: " + this.name + ", " + "Instructor: " + this.instructor + ", " + "Total time: " + this.getTotalTime() + " minutes, " + "Lessons: " + this.lessons + "]";
        }

        public void enroll(Student student) {
            this.students.add(student);
            this.matriculationIndex.put(student.getNumber(), student);
        }

        public Set<Student> getStudents() {
            return Collections.unmodifiableSet(students);
        }

        public boolean isStudentEnrolled(Student student) {
            return this.students.contains(student);
        }

        public Student searchStudent(int number) {
            return this.matriculationIndex.get(number);
        }
}
