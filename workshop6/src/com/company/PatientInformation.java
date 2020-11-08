package com.company;

/**
 * This class holds patient informations
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class PatientInformation {
    private String birthDate;
    private String sexuality;
    private String insurance;
    private String degree;
    private String job;
    private String address;

    public PatientInformation(String birthDate, String sexuality, String insurance, String degree, String job, String address){
        this.address = address;
        this.birthDate = birthDate;
        this.degree = degree;
        this.insurance = insurance;
        this.job = job;
        this.address = address;
        this.sexuality = sexuality;

    }

    public String getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDegree() {
        return degree;
    }

    public String getInsurance() {
        return insurance;
    }

    public String getJob() {
        return job;
    }

    public String getSexuality() {
        return sexuality;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }
}
