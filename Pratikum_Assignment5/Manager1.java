public class Manager1 extends Karyawan {

    public int tunjangan;

    public Manager1() {
    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();

        System.out.println("Tunjangan     =" + tunjangan);
        System.out.println("Total Gaji    =" + (super.gaji + tunjangan));
    }
}