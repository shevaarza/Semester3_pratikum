package classrelation.experiment4;

public class Passenger {
    private String idCard;
    private String name;

    public Passenger(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getName() {
        return name;
    }

    public String info() {
        String info = "";
        info += "IdCard:" + idCard + "\n";
        info += "Name:" + name + "\n";
        return info;
    }
}
