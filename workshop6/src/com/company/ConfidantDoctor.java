package com.company;

import java.util.ArrayList;

public class ConfidantDoctor extends Person {
    private MedicalReport medicalReport;
    private ArrayList<String> confidantDoctors;
    public enum Accessiblity{
        ALLMEDICALREPORT,
        SAMEMEDICALREPORT
    }

    public ConfidantDoctor(String name, MedicalReport medicalReport,Accessiblity accessiblity){
        super(name);
        this.medicalReport = medicalReport;
        this.confidantDoctors = new ArrayList<>();
        confidantDoctors.add(name);
    }

    public ArrayList<String> getConfidantDoctors() {
        return confidantDoctors;
    }

    public MedicalReport getMedicalReport() {
        return medicalReport;
    }

    public void addCondidantDoctor(String doctor){
        confidantDoctors.add(doctor);
    }

}
