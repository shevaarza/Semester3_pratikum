public class Customers {
    private  String name;
    private Car car;
    private Driver driver;
    private  int days ;

    public Customers(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    public void setCar(Car car){
        this.car = car;
    }
    public Car  getCar(){
        return  car;
    }
    public void setDriver(Driver driver){
        this.driver = driver;
    }
    public Driver getDriver(){
        return driver;
    }
    public void setDays(int days){
        this.days = days;
    }
    public int getDay(){
        return days;
    }
    public int calculateTotalCost(){
        return  car.calculateCarCost(days) + driver.calculateDriverCost(days);
    }
}
