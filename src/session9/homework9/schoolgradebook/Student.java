package session9.homework9.schoolgradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {
    private String name;
    private UUID id;

    public Student( String name){
        this.name = name;
        this.id = UUID.randomUUID();
    }
    public List<Double> grades = new ArrayList<>();
    public void addGrade(double grade){
        grades.add(grade);
    }
    public double averageGrades(){
        double sum = 0;
        for(double grade: grades){
            sum += grade;
        }
        if(sum>0){
            return sum/grades.size();
        }
        return -1;
    }

    @Override
    public String toString() {
        return  "name= " + name + ", id= " + id + " Average of the grades is: "+ averageGrades();
    }


}
