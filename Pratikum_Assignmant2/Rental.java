public class Rental {
    
    private int rental_id ;
    private int duration ;
    private double amountToPay ;

    private Member member;
    private Game game ;

    public Rental(int duration ,int rental_id , Member member , Game game ){
        this.duration = duration;
        this.rental_id = rental_id;
        this.member = member;
        this.game = game;
        this.amountToPay = calculatePayment();
    }

    public double calculatePayment(){
        amountToPay = game.pricePerDay() * duration;
        return amountToPay;
    }

    public void displayData() {
        System.out.println("---------- RENTAL DATA --------------");
        System.out.println("id Member       : " + member.getid());
        System.out.println("Rental id       : " + rental_id);
        System.out.println("Member Name     : " + member.getmembername());
        System.out.println("Game name       : " + game.getGameName());
        System.out.println("Duration        : " + duration);
        System.out.println("Price per day   : " + game.pricePerDay());
        System.out.println("Amount Pay      :"  + amountToPay) ;

    }
}
