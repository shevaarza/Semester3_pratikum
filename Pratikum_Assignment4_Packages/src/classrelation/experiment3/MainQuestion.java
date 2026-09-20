package classrelation.experiment3;

public class MainQuestion {
    public static void main(String[] args) {
        Employee trainDriver = new Employee("1234", "Sheva Arzadina Hizbullah");
        // Memakai constructor 3 parameter -> assistant = null
        Train train = new Train("Gaya Baru", "Business", trainDriver);
        System.out.println(train.info());
    }
}
