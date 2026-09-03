public class Game {
    
    private String gameName ;
    private double pricePerDay ;

    public Game(String gameName , double pricePerDay){
        this.gameName = gameName;
        this.pricePerDay = pricePerDay;
    }

    public String getGameName(){
        return gameName ;
    }
    public double pricePerDay(){
        return pricePerDay;
    }
}
