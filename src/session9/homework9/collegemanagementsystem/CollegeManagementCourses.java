package session9.homework9.collegemanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CollegeManagementCourses {

    public static void main(String[] args) {
     Courses math = new Courses("Math", "Monday","2h","Algebra");
        math.assignProfesor(new Professor("Mihain", "Popescu", "male", 34));
        System.out.println(math);
    }
}
