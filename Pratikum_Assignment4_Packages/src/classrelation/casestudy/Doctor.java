package classrelation.casestudy;

public class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Prescription examine(Patient patient) {
        String medicine = specialization.equals("Gigi")
                ? "Obat pereda nyeri gigi untuk keluhan " + patient.getComplaint()
                : "Paracetamol untuk keluhan " + patient.getComplaint();
        return new Prescription(patient.getName(), name, medicine);
    }
}
