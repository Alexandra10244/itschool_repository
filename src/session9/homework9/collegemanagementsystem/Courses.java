package session9.homework9.collegemanagementsystem;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Courses {

    private String coursName;
    private String schedule;
    private String duration;
    private String description;
    private Professor assignProfesor;

    public Courses (String coursName, String schedule, String duration, String description) {
        this.coursName = coursName;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    public void assignProfesor(Professor professor){
        this.assignProfesor = professor;
    }

    @Override
    public String toString() {
        return  "Course= " + coursName +
                ", schedule= " + schedule +
                ", duration=" + duration +
                ", description= " + description  +
                ", assignProfesor=" + assignProfesor;
    }
}
