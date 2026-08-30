public class Demo {
    public static void main(String[] args) {

        // Create object for Motorcycle
        Motorcycle motorcycle = new Motorcycle();

        motorcycle.brand = "Honda";
        motorcycle.engineCapacity = 150;
        motorcycle.color = "Black";
        motorcycle.speed = 100;

        System.out.println("===== MOTORCYCLE =====");
        motorcycle.start();
        motorcycle.ride();
        motorcycle.honk();
        motorcycle.showInfo();

        System.out.println();


        // Create object for Bicycle
        Bicycle bicycle = new Bicycle();

        bicycle.brand = "Polygon";
        bicycle.gear = 18;
        bicycle.color = "Blue";
        bicycle.speed = 30;

        System.out.println("===== BICYCLE =====");
        bicycle.start();
        bicycle.ride();
        bicycle.changeGear();
        bicycle.showInfo();

        System.out.println();


        // Create object for Laptop
        Laptop laptop = new Laptop();

        laptop.brand = "Lenovo";
        laptop.ram = 16;

        System.out.println("===== LAPTOP =====");
        laptop.turnOn();
        laptop.openApplication();
        laptop.showInfo();

        System.out.println();


        // Create object for Smartphone
        Smartphone smartphone = new Smartphone();

        smartphone.brand = "Samsung";
        smartphone.battery = 85;

        System.out.println("===== SMARTPHONE =====");
        smartphone.turnOn();
        smartphone.makeCall();
        smartphone.showInfo();
    }
}