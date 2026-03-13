package person;

import person.Patient;

public class Nurse {
    private String name;
    private String shift;
    private Patient[] patients;

    public Nurse(String name, String shift, Patient[] patients) {
        this.name = name;
        this.shift = shift;
        this.patients = patients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
}