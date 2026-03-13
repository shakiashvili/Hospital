package person;

import person.Patient;
import equipment.Equipment;

public class Doctor {
    private String name;
    private String specialization;
    private Equipment[] equipments;
    private Patient[] patients; // Assigned patients

    public Doctor(String name, String specialization, Equipment[] equipments,
                  Patient[] patients) {
        this.name = name;
        this.specialization = specialization;
        this.equipments = equipments;
        this.patients = patients;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Equipment[] getEquipments() {
        return equipments;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setEquipments(Equipment[] equipments) {
        this.equipments = equipments;
    }
    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
}