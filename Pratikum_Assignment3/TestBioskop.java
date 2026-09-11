public class TestBioskop {

    public static void main(String[] args) {

        Tiket tiket1 = new Tiket("Interstellar", 50000);
        System.out.println("Film              : " + tiket1.getJudulFilm());
        System.out.println("Harga             : Rp " + tiket1.getHargaDasar());
        System.out.println("Status Pembayaran : " + (tiket1.isStatusPembayaran() ? "Lunas" : "Belum Bayar"));

        tiket1.lakukanPembayaran();
        System.out.println("Status Pembayaran : " + (tiket1.isStatusPembayaran() ? "Lunas" : "Belum Bayar"));

        System.out.println("--------------------------------------------------");

        Tiket tiket2 = new Tiket("Spirited Away", -10000);
        System.out.println("Film              : " + tiket2.getJudulFilm());
        System.out.println("Harga (Default)   : Rp " + tiket2.getHargaDasar());
        System.out.println("Status Pembayaran : " + (tiket2.isStatusPembayaran() ? "Lunas" : "Belum Bayar"));
    }
}