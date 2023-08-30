package session10.practice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    List<Patient> patients = new ArrayList<>();
    List<Doctor> doctors;

    public void admitPatientToList(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients(){
        return patients;
    }
}
