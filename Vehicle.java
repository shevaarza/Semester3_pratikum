public class Vehicle {

    String color;
    int speed;

    // Method 1
    public void start() {
        System.out.println("Vehicle is starting.");
    }

    // Method 2
    public void stop() {
        System.out.println("Vehicle is stopping.");
    }

    // Method 3
    public void showInfo() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}