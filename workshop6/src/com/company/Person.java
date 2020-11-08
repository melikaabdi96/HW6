package com.company;

import java.util.ArrayList;

public class Person {
    private ArrayList<String> patients;
    private ArrayList<String> doctors;
    private String name;

    public Person(String name){
        this.name = name;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(String name){
        if (!doctors.contains(name)){
            doctors.add(name);
        }
    }

    public void addPatient(String name){
        if (!patients.contains(name)){
            patients.add(name);
        }
    }
    public String getName() {
        return name;
    }

    public ArrayList<String> getDoctors() {
        return doctors;
    }

    public ArrayList<String> getPatients() {
        return patients;
    }

    public void setDoctors(ArrayList<String> doctors) {
        this.doctors = doctors;
    }

    public void setPatients(ArrayList<String> patients) {
        this.patients = patients;
    }

}
