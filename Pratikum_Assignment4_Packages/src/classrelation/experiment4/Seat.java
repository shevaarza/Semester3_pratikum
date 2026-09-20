package classrelation.experiment4;

public class Seat {
    private String number;
    // Relasi: Seat menyimpan Passenger (boleh kosong / null)
    private Passenger passenger;

    public Seat(String number) {
        this.number = number;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String info() {
        String info = "";
        info += "Number: " + number + "\n";
        if (this.passenger != null) {
            info += "Passenger: " + passenger.info() + "\n";
        }
        return info;
    }
}
