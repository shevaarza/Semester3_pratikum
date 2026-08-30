public class Smartphone {

    String brand;
    int battery;

    // Method 1
    public void turnOn() {
        System.out.println("Smartphone is turned on.");
    }

    // Method 2
    public void makeCall() {
        System.out.println("Smartphone is making a call.");
    }

    // Method 3
    public void showInfo() {
        System.out.println("=== Smartphone Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Battery: " + battery + "%");
    }
}