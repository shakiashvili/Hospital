package person;

import services.MedicalRecord;
import services.Prescription;

public class Patient {
    private String name;
    private int age;
    private MedicalRecord record;
    private Prescription prescription;

    public Patient(String name, int age, MedicalRecord record, Prescription prescription) {
        this.name = name;
        this.age = age;
        this.record = record;
        this.prescription = prescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MedicalRecord getRecord() {
        return record;
    }

    public void setRecord(MedicalRecord record) {
        this.record = record;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}