package session11.homework11.marks;

public abstract class Marks {

    public abstract double getPercentage();
}

class StudentA extends Marks {

    int subject1;
    int subject2;
    int subject3;

    public StudentA(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        System.out.println("Marks for A: " + subject1 + " " + subject2 + " " + subject3);
    }

    @Override
    public double getPercentage() {
        int marks = subject1 + subject2 + subject3;
        double percentage = marks / 3;
        return percentage;
    }
}

class StudentB extends Marks {

    int subject1;
    int subject2;
    int subject3;
    int subject4;

    public StudentB(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        System.out.println("Marks for B: " + subject1 + " " + subject2 + " " + subject3 + " " + subject4);
    }

    @Override
    public double getPercentage() {
        int marks = subject1 + subject2 + subject3 + subject4;
        double percentage = marks / 4;
        return percentage;
    }
}
