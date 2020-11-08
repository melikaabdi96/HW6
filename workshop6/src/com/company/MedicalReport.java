package com.company;

import java.util.ArrayList;

public class MedicalReport {
    private ArrayList<String> disease;
    private String condition;
    private ConfidantDoctor confidantDoctor;
    private ArrayList<String> medicine;
    private String date;

    public  MedicalReport(String condition,ConfidantDoctor confidantDoctor, String date){
        this.condition = condition;
        this.confidantDoctor = confidantDoctor;
        this.date = date;
        this.medicine= new ArrayList<>();
        this.disease = new ArrayList<>();
    }

    public ArrayList<String> getMedicine() {
        return medicine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getDisease() {
        return disease;
    }

    public ConfidantDoctor getConfidantDoctor() {
        return confidantDoctor;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setConfidantDoctor(ConfidantDoctor confidantDoctor) {
        this.confidantDoctor = confidantDoctor;
    }

    public void setDisease(ArrayList<String> disease) {
        this.disease = disease;
    }

    public void setMedicine(ArrayList<String> medicine) {
        this.medicine = medicine;
    }

}
