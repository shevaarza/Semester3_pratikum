package classrelation.experiment4;

public class Carriage {

    private String code;
    // Relasi: Carriage terdiri dari array Seat
    private Seat[] seatArray;

    public Carriage(String code, int count) {
        this.code = code;
        this.seatArray = new Seat[count];
        this.initSeats();
    }

    // Seat dibuat OLEH Carriage sendiri (bukan dari luar)
    private void initSeats() {
        for (int i = 0; i < seatArray.length; i++) {
            this.seatArray[i] = new Seat(String.valueOf(i + 1));
        }
    }

    // Nomor kursi dimulai dari 1, sedangkan indeks array dimulai dari 0
    public void setPassenger(Passenger passenger, int number) {
        this.seatArray[number - 1].setPassenger(passenger);
    }

    public String info() {
        String info = "";
        info += "Code: " + code + "\n";
        for (Seat seat : seatArray) {
            info += seat.info();
        }
        return info;
    }
}
