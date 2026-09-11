public class Motor {
    private int kecepatan = 0;
    private boolean kontakon = false;


    public void printStatus() {
        if (kontakon == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }

        System.out.println("Kecepatan " + kecepatan + "\n");
    }
    public  void matikannMechine(){
        kontakon = false;
    }
    public void nyalakanMechine(){
        kontakon = true;
    }
    public void tambahKecepatan(){
        if(kontakon == true && kecepatan < 100){
            kecepatan += 5 ;
        }else{
            System.out.println("Kecepatan tidak bisa bisa bertambah karena mechine off");
        }
    }
    
    public void kurangiKecepatan(){
        if(kontakon == true){
            kecepatan -=5;
        }else{
            System.out.println("Kecepatan tidak bisa di kurangi karena mechine off");
        }
    }


}