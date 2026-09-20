

public class Laptop {
    private String brand;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String brand, Processor proc) {
        this.brand = brand;
        this.proc = proc;
    }

public Laptop(String brand) {
    this.brand = brand;
    this.proc = new Processor("Generic", 1);
}

    public String getBrand() {
        return brand;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    public void info() {
        System.out.println("Laptop Brand = " + brand);
        proc.info();
    }
}