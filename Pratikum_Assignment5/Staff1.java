public class Staff1 extends Karyawan {

    public int lembur, potongan;

    public Staff1() {
    }

    public Staff1(String nama, String alamat, String jk, int umur,
                 int gaji, int lembur, int potongan) {

        super(nama, alamat, jk, umur, gaji);

        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaff() {
        super.tampilDataKaryawan();

        System.out.println("Lembur        =" + lembur);
        System.out.println("Potongan      =" + potongan);
        System.out.println("Total Gaji    =" + (gaji + lembur - potongan));
    }
}