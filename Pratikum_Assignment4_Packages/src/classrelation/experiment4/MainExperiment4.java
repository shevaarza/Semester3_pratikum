package classrelation.experiment4;

public class MainExperiment4 {

    public static void main(String[] args) {
        Passenger p = new Passenger("1234", "shevaarza");
        Passenger budi = new Passenger("5678", "Budi");
        Carriage carriage = new Carriage("A", 10);

        carriage.setPassenger(p, 1);
        carriage.setPassenger(budi, 2);

        System.out.println(carriage.info());
    }
}
