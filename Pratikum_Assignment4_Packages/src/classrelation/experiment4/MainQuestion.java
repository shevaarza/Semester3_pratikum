package classrelation.experiment4;

public class MainQuestion {

    public static void main(String[] args) {
        Passenger p = new Passenger("1234", "shevaarza");
        Passenger budi = new Passenger("5678", "Budi");
        Carriage carriage = new Carriage("B", 3);

        // Dua penumpang diletakkan di kursi nomor 1 -> yang terakhir menimpa
        carriage.setPassenger(p, 1);
        carriage.setPassenger(budi, 1);
        System.out.println(carriage.info());

        // Nomor kursi melebihi jumlah kursi (3) -> error
        try {
            carriage.setPassenger(p, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
    }
}
