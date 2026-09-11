public class Member {
    
    private String name ;
    private String address;
    private float simpanan;

    Member(String name , String address){
        this.name = name ;
        this.address = address;
        this.simpanan = 0;
    }
    public  void setName(String name){
        this.name = name;
    }

    public  void setAddress(String address){
        this.address = address;
    }
    public String getname(){
        return name;
    }
    public  String getAddress(){
        return  address;
    }
    public  float getsimpanan(){
        return  simpanan;
    }
    public  void setor(float money){
        simpanan += money;
    }
    public void pinjam(float money ){
        simpanan -= money;
    }
}
