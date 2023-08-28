package session9.homework9.collegemanagementsystem;

import java.time.LocalDate;
import java.util.UUID;

public class Professor {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private LocalDate dateOfBirth;
    private UUID SSN;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public Professor(String firstName, String lastName, String gender, int age){
        this.firstName=firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName ;
    }
}
