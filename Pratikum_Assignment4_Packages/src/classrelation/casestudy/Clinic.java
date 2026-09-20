package classrelation.casestudy;

import java.util.ArrayList;

public class Clinic {
    private String name;
    private Room[] rooms;

    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Clinic(String name, int roomCount) {
        this.name = name;
        this.rooms = new Room[roomCount];
        for (int i = 0; i < rooms.length; i++) {
            this.rooms[i] = new Room(i + 1);     
        }
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

  
    public int admitPatient(Patient patient) {
        for (Room room : rooms) {
            if (room.isFree()) {
                room.occupy(patient.getName());
                return room.getNumber();
            }
        }
        return -1;
    }

    public String info() {
        String info = "Klinik: " + name + "\n";
        info += "Dokter:\n";
        if (doctors.isEmpty()) {
            info += "  (belum ada dokter)\n";
        }
        for (Doctor doctor : doctors) {
            info += "  " + doctor.getName() + " (" + doctor.getSpecialization() + ")\n";
        }
        info += "Ruang:\n";
        for (Room room : rooms) {
            info += "  " + room.info() + "\n";
        }
        return info;
    }
}
