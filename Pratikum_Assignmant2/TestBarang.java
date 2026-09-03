public class TestBarang {
    public static void main(String[] args) {
        
        Barang brg1 = new Barang();

        brg1.itemname = "Pencil";
        brg1.kinditem = "ATK";
        brg1.stock = 10;
        brg1.showitem();

        System.out.println("new stock is " + brg1.addstock(20));
    }
}
