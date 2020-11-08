package com.company;

import java.util.ArrayList;

public class CentralizedHealthSystem {
    private ArrayList<MedicalReport> medicalReports;

    public CentralizedHealthSystem(){
        this.medicalReports = new ArrayList<>();
    }

    public ArrayList<MedicalReport> getMedicalReports() {
        return medicalReports;
    }

}
