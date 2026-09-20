public class Laptops {
    private String brand ;

    public Laptops(String brand) {
        this.brand = brand;
    }

    public void printDocument(Printer printer , String fileName){
        System.out.println(brand + " is sending a document to the printer...");
        printer.print(fileName);
    }
}
