public class MainQuestion {
    public static void main(String[] args) {
        Employee trainDriver = new Employee("1234", "Sheva arzadina hizbullah");
        Train train = new Train("Gaya Baru","Bussines", trainDriver);
        System.out.println(train.info());
    }
}
