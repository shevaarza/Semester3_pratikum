package classrelation.casestudy;

public class Room {
    private int number;
    private String occupiedBy;   
    public Room(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFree() {
        return occupiedBy == null;
    }

    public void occupy(String patientName) {
        this.occupiedBy = patientName;
    }

    public String info() {
        return "Ruang " + number + ": " + (isFree() ? "kosong" : "dipakai " + occupiedBy);
    }
}
