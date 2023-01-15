package com.company;

public class Student {
    private String Name;
    private int EstonianPersonalID;
    private int AdmissionYear;
    private String OriginCountry;
    private String Address;
    private int AccountNumber;
    private int PhoneNumber;
    private String CurriculumName;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEstonianPersonalID() {
        return EstonianPersonalID;
    }

    public void setEstonianPersonalID(int estonianPersonalID) {
        EstonianPersonalID = estonianPersonalID;
    }

    public int getAdmissionYear() {
        return AdmissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        AdmissionYear = admissionYear;
    }

    public String getOriginCountry() {
        return OriginCountry;
    }

    public void setOriginCountry(String originCountry) {
        OriginCountry = originCountry;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getCurriculumName() {
        return CurriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        CurriculumName = curriculumName;
    }

    public Student(String name, int EstonianPersonalID, int admissionYear, String OriginCountry, String Address, int AccountNumber, int PhoneNumber, String CurriculumName ) {
        Name = name;
        this.EstonianPersonalID = EstonianPersonalID;
        this.AdmissionYear = admissionYear;
        this.OriginCountry = OriginCountry;
        this.Address = Address;
        this.AccountNumber= AccountNumber;
        this.PhoneNumber = PhoneNumber;
        this.CurriculumName = CurriculumName;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", EstonianPersonalID='" + EstonianPersonalID + '\'' +
                ", admissionYear=" + AdmissionYear + ", Country of Origin= " + OriginCountry + ", Address= " + Address + ", AccountNumber= " + AccountNumber + ", PhoneNumber= " + PhoneNumber
                + ", Curriculum= " + CurriculumName +
                '}';


        }

    }