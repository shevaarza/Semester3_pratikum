public class Barang2 {
    private String code;
    private String ItemName;
    private int basicPrice;
    private float discont;

    public Barang2 (String code , String ItemName , int basicPrice , float discont){
        this.code = code;
        this.ItemName = ItemName;
        this.basicPrice = basicPrice;
        this.discont = discont;
    }

   public float amountPriceSell() {
    float discounts = (discont / 100) * basicPrice;
    float selling_price = basicPrice - discounts;
    return selling_price;
}

    public void displaydata(){
        System.out.println("-------- Display Data -------- ");
        System.out.println("Product Name    :" + ItemName);
        System.out.println("Code Product    :" + code);
        System.out.println("Base price      :" + basicPrice);
        System.out.println("discount        :" + discont);
        System.out.println("Amount Discount :" + amountPriceSell());
    }
}
