public class Barang {
    
    public String itemname;
    public String kinditem;
    public int stock;
    public int barangmasuk;
    public void showitem(){
        System.out.println("Item Name       :" + itemname);
        System.out.println("item category   :" + kinditem);
        System.out.println("Item stock      :" + stock);

    }

    public int addstock(int barangmasuk){
        int newstock = barangmasuk + stock;
        return newstock;
    }
}
