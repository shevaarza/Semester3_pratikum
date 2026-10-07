public class TiketInternasional extends TiketPesawat {
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
        super();
    }

    public TiketInternasional(String kodeTiket, String namaPenumpang, String asal, String tujuan,
                              int hargaDasar, String maskapai, int beratBagasi,
                              String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        super.tampilPesawat();
        System.out.println("Nomor Paspor   = " + nomorPaspor);
        System.out.println("Asuransi       = " + asuransi);
        int total = hargaDasar + hitungBiayaBagasi() + asuransi;
        System.out.println("Total Bayar    = " + total);
    }
}