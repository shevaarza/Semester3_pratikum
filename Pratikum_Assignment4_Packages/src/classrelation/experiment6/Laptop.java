package classrelation.experiment6;

public class Laptop {
    private String brand;
    // Tidak ada atribut bertipe Printer: Laptop hanya "memakai" Printer sementara

    public Laptop(String brand) {
        this.brand = brand;
    }

    // Relasi dependency: Printer hanya ada sebagai parameter method
    public void printDocument(Printer printer, String fileName) {
        System.out.println(brand + " is sending a document to the printer...");
        printer.print(fileName);
    }
}
