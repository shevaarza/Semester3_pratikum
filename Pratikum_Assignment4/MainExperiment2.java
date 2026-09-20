public class MainExperiment2 {
    public static void main(String[] args) {
        Car m = new Car();
        m.setBrand("Avanza");
        m.setCost(350000);

        Driver s = new Driver();
        s.setName("Sheva Arzadina");
        s.setCost(200000);

        Customers p = new Customers();
        p.setName("Sheva Arzadina ");
        p.setDriver(s);
        p.setCar(m);
        p.setDays(2);

        System.out.println("Total Cost = " + p.calculateTotalCost());
        System.out.println(p.getCar().getBrand());
    }
}
