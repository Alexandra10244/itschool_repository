package session9.homework9.schoolgradebook;

import java.util.ArrayList;
import java.util.List;

public class Gradebook {
    public List<Student> students;

    public Gradebook() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }


}
