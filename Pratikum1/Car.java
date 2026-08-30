class car {
    private String brand ;
    private int speedmax ;

    public car (String brand , int speedmax){
        this.brand = brand;
        this.speedmax = speedmax;
    }

    public void startenggine(){
        System.out.println("car enggine" + brand + " Starting ... vrommm!");
    }

    public void running(){
        System.out.println("Car " + brand + " running with speed maximal " + speedmax + " Km/jam.");
    }

    public void printinfo(){
        System.out.println("----- print info -------");
        System.out.println("Type car : "  + brand );
        System.out.println("speedmax : " + speedmax + " Km/jam" );
    }
}