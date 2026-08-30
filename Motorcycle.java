public class Motorcycle extends Vehicle {

    String brand;
    int engineCapacity;

    // Method 1
    public void ride() {
        System.out.println("Motorcycle is being ridden.");
    }

    // Method 2
    public void honk() {
        System.out.println("Motorcycle horn: Beep Beep!");
    }

    // Method 3
    public void showInfo() {
        System.out.println("=== Motorcycle Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}