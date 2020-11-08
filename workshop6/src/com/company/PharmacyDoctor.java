package com.company;

import java.util.ArrayList;

public class PharmacyDoctor {
    private MedicalReport medicalReport;
    private ArrayList<String> medicine;

    public PharmacyDoctor(MedicalReport medicalReport, Patient patient){
        this.medicalReport = medicalReport;
        this.medicine = new ArrayList<>();
    }

    public ArrayList<String> getMedicine() {
        return medicine;
    }

    public void sellMedicine(){}

    public void checkReport(){}
}
