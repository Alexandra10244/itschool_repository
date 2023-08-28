package session9.homework9.schoolgradebook;

public class StudentGradebook {
    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook();
        Student student1 = new Student("Mihai");
        Student student2 = new Student("Ana");
        student1.addGrade(5);
        student1.addGrade(8);
        student1.addGrade(6);
        student2.addGrade(6);
        student2.addGrade(10);
        student2.addGrade(9);

        System.out.println(student1);
    }
}
