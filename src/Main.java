import java.time.LocalDateTime;
import java.math.BigDecimal;
import equipment.*;
import infrastructure.*;
import person.*;
import services.*;
import department.Department;
import hospital.Hospital;

public class Main {

    public static void main(String[] args) {
        // 1. Bottom Level (Equipment and Records)
        Equipment scissors = new Equipment("Scissors", true);
        Equipment[] doctorEquipments = {scissors};

        MedicalRecord record = new MedicalRecord("Checkup", LocalDateTime.now());
        Prescription prescription = new Prescription("Aspirin", new BigDecimal("15.50"));

        // 2. People Level
        Patient patient = new Patient("Giorgi", 22, record, prescription);
        Patient[] patients = {patient};

        Doctor doctor = new Doctor("Lasha", "Cardiology", doctorEquipments, patients);
        Doctor[] doctors = {doctor};

        Nurse nurse = new Nurse("Ana", "Night Shift", patients);
        Nurse[] nurses = {nurse};

        Receptionist receptionist = new Receptionist("Nina", "Night Shift");

        // 3. Infrastructure Level
        WaitingRoom waitingRoom = new WaitingRoom(20, receptionist);

        Room room = new Room("15", patient, doctorEquipments);
        Room[] rooms = {room};

        Department cardiology = new Department("Cardiology", doctors, nurses, rooms);
        Department[] departments = {cardiology};

        Building building = new Building("University Street", 5, rooms);

        Ambulance ambulance = new Ambulance("TB-344-TB", true);
        Ambulance[] ambulances = {ambulance};

        Parking parking = new Parking(50, new BigDecimal("5.90"));

        // 4. Root Object
        Hospital hospital = new Hospital("Med Hospital", building, departments, ambulances, parking, waitingRoom);

        System.out.println("Welcome to " + hospital.getName());

        // 5. Business Method #1 for parking
        LocalDateTime arrival = LocalDateTime.now().minusHours(4);
        LocalDateTime departure = LocalDateTime.now();
        parking.processParking(arrival, departure);

        //6. Business method #2 for admission

        Appointment appointment = new Appointment();
        appointment.bookAppointment(patient, doctor,LocalDateTime.now());
    }
}