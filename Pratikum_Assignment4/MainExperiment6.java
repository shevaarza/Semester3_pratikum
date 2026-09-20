public class MainExperiment6 {
    
    public static void main(String[] args) {
        Laptops laptop = new Laptops("Thinkpad");
        Printer printer = new Printer("Epison L3110");

        laptop.printDocument(printer, "Report.pdf");
    }
}
