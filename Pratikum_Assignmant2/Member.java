public class Member {

    private int id;
    private String memberName;

    public Member (String memberName ,int id){
        this.id = id;
        this.memberName = memberName;
    }
    
    public int getid( ){
        return id;
    }
    public String getmembername(){
        return memberName;
    }
}
