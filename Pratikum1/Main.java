class Mahasiswa {
    private String nim;
    private String name;
   


    public Mahasiswa(String nim , String name ){
        this.nim = nim;
        this.name = name;
    }

   
    public String getname() {
        return name;
    }
    public String getnim(){
        return nim;
    }

    public void jargon() {
        System.out.println(name + "please make a jargon");
    }
}

class Informatic extends Mahasiswa{

    private String uniform;

    public Informatic(String nim , String name , String uniform){
        super(nim, name);
        this.uniform = uniform;
    }

    @Override
    public void jargon() {
        System.out.println(getname() + " TI fast ");
    }

    public void showuniform() {
        System.out.println("Uniform : " + uniform);
    }
}

public class Main {
    public static void main(String[] args) {
        Informatic informatic = new Informatic("254107020", "shevaarza", "merahputih");

           informatic.jargon();
           informatic.showuniform();
    }

 
}
