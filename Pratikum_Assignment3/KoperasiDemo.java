public class KoperasiDemo {
 
    public  static void main(String[] args){
        Member member1 = new Member("Sheva", "jl wilis");
        System.out.println("Simpanan " + member1.getname() + " : Rp " + member1.getsimpanan());

        member1.setName("Sheva");
        member1.setAddress("Merjosari 51 ");
        member1.setor(2000000);
        System.out.println("Simpanan: " + member1.getname() + " : Rp " + member1.getsimpanan()) ;


        member1.pinjam(5000);
        System.out.println("Simpanan: "+ member1.getname() + " : Rp " + member1.getname() + " : Rp " + member1.getsimpanan());
    }
}
