public class Tiket {

    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        this.statusPembayaran = false;


        if (hargaDasar < 0) {
            this.hargaDasar = 35000.0;
        } else {
            this.hargaDasar = hargaDasar;
        }
    }

    public String getJudulFilm() {
        return judulFilm;
    }


    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }


    public void setHargaDasar(double hargaDasar) {
        if (hargaDasar < 0) {
            this.hargaDasar = 35000.0;
        } else {
            this.hargaDasar = hargaDasar;
        }
    }


    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void lakukanPembayaran() {
        this.statusPembayaran = true;
        System.out.println("Pembayaran untuk tiket \"" + this.judulFilm + "\" berhasil diverifikasi.");
    }
}