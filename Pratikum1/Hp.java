class hp {
    protected String name;
    protected double price;
    protected String describe;
    protected String brand;

    public hp(String name , String describe , double price , String brand){
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.brand = brand;
    }

    public void describes(){
        System.out.println("the handphone " + name + " unsually used people to daily activity. there are from brand " + brand);
    }

    public void printinfo() {
        System.out.println("Name handphone : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("describe : " + describe);
    }
}


class iphone extends hp{
    private String display;

    public iphone(String display , String name , String describe , String brand , double price ){
        super(name, describe, price, brand);
        this.display = display;
    }

    public void display() {
        System.out.println(name + " have kind display is " + display);
    }
    public void printinfo(){
        System.out.println("-------- print info -------");
        super.printinfo();
        System.out.println("Display : " + display    );
    }
}