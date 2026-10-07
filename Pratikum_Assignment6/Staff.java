public class Staff extends Employee {
private int lembur ;
private double gajilembur ;

public void setLebur(int lembur){
    this.lembur = lembur;   
}
public int getLembur(){
    return lembur;
}
public void setgajilembur(double gajilembur){
    this.gajilembur = gajilembur;
}

public double getgajilembur(){
    return gajilembur;
}

public double getgaji(int lembur , double gajilembur){
    return super.getGaji() + lembur * gajilembur;
}
public double getGaji() {
    return super.getGaji() + lembur * gajilembur;
}

public void showinfo(){
    System.out.println("NIP : " + this.getNip());
    System.out.println("Nama : " + this.getNama());
    System.out.println("Golongan : " + this.getGolongan());
    System.out.println(" Jumlah Lembur : " + this.getLembur());
    System.out.println("Gaji Lembur : " + this.getgajilembur());
    System.out.println("Gaji : 0f\n " + this.getGaji());

}
}