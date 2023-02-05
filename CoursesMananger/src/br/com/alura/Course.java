package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
    
        private String name;
        private String instructor;
        private List<Lesson> lessons = new ArrayList<>();
    
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
}
