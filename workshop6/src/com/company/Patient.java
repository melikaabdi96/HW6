package com.company;

import java.util.ArrayList;

public class Patient extends Person{
    private MedicalReport medicalReport;
    private PatientInformation patientInformation;
    private boolean permission;
    private Person doctor;

    public Patient(String name, MedicalReport medicalReport, PatientInformation patientInformation, boolean permission, Person doctor){
        super(name);
        this.doctor = doctor;
        this.medicalReport = medicalReport;
        this.permission = permission;
        this.patientInformation = patientInformation;
    }

    public MedicalReport getMedicalReport() {
        return medicalReport;
    }

    public boolean isPermission() {
        return permission;
    }
}
