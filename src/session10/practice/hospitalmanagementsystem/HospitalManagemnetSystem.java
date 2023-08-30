package session10.practice.hospitalmanagementsystem;

import javax.print.Doc;

public class HospitalManagemnetSystem {

    public static void main(String[] args) {

        Patient patient1 = new Patient("Ana", 45);
        Patient patient2 = new Patient("Mira", 35);
        Patient patient3 = new Patient("Lili", 25);

        Doctor doctor1 = new Doctor("Alin","Urology");
        Doctor doctor2 = new Doctor("Stone","Ophtalmology");
        Doctor doctor3 = new Doctor("Jones","Surgery");

        Hospital arcadia = new Hospital();
        Hospital judetean = new Hospital();

        arcadia.admitPatientToList(patient1);
        judetean.admitPatientToList(patient2);
        arcadia.admitPatientToList(patient3);

        for(Patient patient: arcadia.getPatients()){
            System.out.println("Ptients of Arcadia: "+ patient.getName());
        }

    }
}
