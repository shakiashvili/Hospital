package department;

import infrastructure.Room;
import person.Doctor;
import person.Nurse;


public class Department {

    private String name;
    private Doctor[] doctors;
    private Nurse[] nurses;
    private Room[] rooms;

    public Department(String name, Doctor[] doctors, Nurse[] nurses, Room[] rooms) {
        this.name = name;
        this.doctors = doctors;
        this.nurses = nurses;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public void setNurses(Nurse[] nurses) {
        this.nurses = nurses;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}