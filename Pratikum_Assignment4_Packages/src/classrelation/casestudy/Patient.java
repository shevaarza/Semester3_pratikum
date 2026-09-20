package classrelation.casestudy;

public class Patient {
    private String name;
    private String complaint;

    public Patient(String name, String complaint) {
        this.name = name;
        this.complaint = complaint;
    }

    public String getName() {
        return name;
    }

    public String getComplaint() {
        return complaint;
    }
}
