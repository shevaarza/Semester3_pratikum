public class Bicycle extends Vehicle {

    String brand;
    int gear;

    // Method 1
    public void ride() {
        System.out.println("Bicycle is being ridden.");
    }

    // Method 2
    public void changeGear() {
        System.out.println("Bicycle gear has been changed.");
    }

    // Method 3
    public void showInfo() {
        System.out.println("=== Bicycle Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Gear: " + gear);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}