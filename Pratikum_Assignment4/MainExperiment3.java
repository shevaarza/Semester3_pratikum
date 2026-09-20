public class MainExperiment3 {
    public static void main(String[] args) {
        Employee trainDriver = new Employee("1234", "Spombob squarepant");
        Employee assistent = new Employee("456", "Patrix Star");
        Train train = new Train("Gaya Baru", "Business", trainDriver, assistent);
        System.out.println(train.info());


        Employee driver = new Employee("E001", "Budi");
        Employee assistant = new Employee("E002", "Andi");

        Train train1 = new Train("Argo Bromo", "Executive", driver, assistant);

        System.out.println(train1.info());
    }
}
