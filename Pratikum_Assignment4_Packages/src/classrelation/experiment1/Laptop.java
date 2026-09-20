package classrelation.experiment1;

public class Laptop {
    private String brand;
    // Relasi: Laptop "memiliki" Processor (has-a) lewat atribut bertipe Processor
    private Processor proc;

    public Laptop() {
    }

    // Processor dibuat DI LUAR lalu dikirim lewat parameter constructor
    public Laptop(String brand, Processor proc) {
        this.brand = brand;
        this.proc = proc;
    }

    // Constructor tanpa Processor: dibuatkan Processor default agar proc tidak null
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
