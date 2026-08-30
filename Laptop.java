public class Laptop {

    String brand;
    int ram;

    // Method 1
    public void turnOn() {
        System.out.println("Laptop is turned on.");
    }

    // Method 2
    public void openApplication() {
        System.out.println("Laptop is opening an application.");
    }

    // Method 3
    public void showInfo() {
        System.out.println("=== Laptop Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }
}