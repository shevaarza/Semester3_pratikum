package classrelation.experiment5;

public class Car {
    private String brand;
    // Relasi komposisi: Engine dibuat DI DALAM Car dan tidak bisa berdiri sendiri
    private Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    public void displayInfo() {
        System.out.println("Car: " + brand);
        System.out.println("Engine: " + engine.getType());
    }
}
