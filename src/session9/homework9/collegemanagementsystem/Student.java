package session9.homework9.collegemanagementsystem;

import java.time.LocalDate;
import java.util.UUID;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private LocalDate dateOfBirth;
    private UUID SSN;
    private String address;

    public Student(String firstName, String lastName, String gender, int age, LocalDate dateOfBirth, UUID SSN, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.SSN = UUID.randomUUID();
        this.address = address;
    }
}
