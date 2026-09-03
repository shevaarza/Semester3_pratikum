public class Main {
    public static void main(String[] args) {
        
        Member member1 = new Member("Sheva", 2103);

        Game game1 = new Game("Mobile Legend", 15000);

        Rental rental1 = new Rental(10, 012, member1, game1);

        rental1.displayData();
        System.out.println();

        Circle circle1 = new Circle(3.14159, 13.21);
    System.out.println("Radius                          :" + circle1.r()); 
    System.out.println("the value from area is          :" +   circle1.area());
    System.out.println("the value from circumference is :" +   circle1.circumference());
        
    System.out.println();

    Barang2 product1 = new Barang2("231", "pencil", 7500, 10);

    System.out.println("Amount Sell Price : " + product1.amountPriceSell());
    product1.displaydata();
    }
}
