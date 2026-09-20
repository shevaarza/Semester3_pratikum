public class Cars {
    private String brand ;
    private Engine engine ;

    public Cars(String brand) {
        this.brand = brand ;
        this.engine = new Engine();
    }
    public  void displayInfo(){
        System.out.println("Car:" + brand);
        System.out.println("Engine: " + engine.getType());
    }

    
}
