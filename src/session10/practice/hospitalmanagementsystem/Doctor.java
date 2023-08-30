package session10.practice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private String name;
    private String sepcialization;
    private List<Patient> patients;

    public String getName() {
        return name;
    }

    public Doctor(String name, String specialization) {
        this.name = name;
        this.sepcialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getSepcialization() {
        return sepcialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

}

