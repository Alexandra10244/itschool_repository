package session8.homework8;

import java.util.ArrayList;
import java.util.List;

//Create 2 empty ArrayLists: studentList and graduateStudentList
//populate studentList with 10 students
//copy values from studentList to graduateStudentList
//iterate through graduateStudentList and print each graduated student
public class StudentListAndGraduateStudentList {

    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        List<String> graduateStudentList = new ArrayList<>();

        studentList.add("Mihai");
        studentList.add("Ana");
        studentList.add("Maria");
        studentList.add("Andrei");
        studentList.add("Carina");
        studentList.add("Ion");
        studentList.add("Paul");
        studentList.add("Paula");
        studentList.add("Alex");
        studentList.add("Marcel");

        graduateStudentList=studentList;
        System.out.println("List of graduating students: ");
        for(String student : graduateStudentList){
            System.out.println(student);
        }

    }
}
