public class Manager extends Employee {
   private double tunjungan ;
   private String bagian;
   private Staff st[];
    
   public void setTunjangan (double tunjungan){
       this.tunjungan = tunjungan;
   }
   public double getTunjangan(){
       return tunjungan;
   }

   public void setBagian(String bagian){
       this.bagian = bagian;
   }
   public String getBagian(){
       return bagian;
   }
   public void setStaff(Staff st[]){
       this.st = st;
   }

   public void viewStaff(){
    int i ;
    System.out.println("------------------");
    for(i = 0 ; i<st.length ; i++){
        st[i].showinfo();
    }
    System.out.println("------------------");
    }
    public void showinfo(){
        System.out.println("Manager :" + this.getBagian());
        System.out.println("NIP : " + this.getNip());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.println("Tunjangan : " + this.getTunjangan());
        System.out.println("Gaji : " + this.getGaji());
        System.out.println("bagian : " + this.getBagian());
        this.viewStaff();
   }
   public double getGaji() {
    return super.getGaji() + tunjungan;
   }
   
}
