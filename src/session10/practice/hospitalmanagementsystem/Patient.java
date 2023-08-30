package session10.practice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Patient {

    private String name;
    private  int age;
    private List<String> medicalHistory;
    private UUID patientID;

    public Patient(String name, int age){
        this.age = age;
        this.name = name;
        this.patientID = UUID.randomUUID();
        this.medicalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public UUID getPatientID() {
        return patientID;
    }

    public void addMedicalHistory(String medicalEvent){
        medicalHistory.add(medicalEvent);
    }
}
