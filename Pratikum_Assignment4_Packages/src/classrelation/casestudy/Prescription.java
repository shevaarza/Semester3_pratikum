package classrelation.casestudy;

public class Prescription {
    private String patientName;
    private String doctorName;
    private String medicine;

    public Prescription(String patientName, String doctorName, String medicine) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.medicine = medicine;
    }

    public String info() {
        return "Resep untuk " + patientName + " dari " + doctorName + ": " + medicine;
    }
}
