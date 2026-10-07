public class TestTiket {
    public static void main(String[] args) {
       
        TiketKereta kereta = new TiketKereta("KA-001", "Andi", "Malang", "Jakarta",
                350000, 3, "12A");
        System.out.println("============ Tiket Kereta ============");
        kereta.tampilKereta();

        TiketDomestik domestik = new TiketDomestik();
        domestik.kodeTiket = "GA-102";
        domestik.namaPenumpang = "Sinta";
        domestik.asal = "Surabaya";
        domestik.tujuan = "Denpasar";
        domestik.hargaDasar = 900000;
        domestik.maskapai = "Garuda Indonesia";
        domestik.beratBagasi = 25;
        domestik.pajakBandara = 75000;
        System.out.println("======== Tiket Pesawat Domestik ========");
        domestik.tampilDomestik();


        TiketInternasional internasional = new TiketInternasional("SQ-205", "Budi", "Jakarta",
                "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        System.out.println("====== Tiket Pesawat Internasional ======");
        internasional.tampilInternasional();
    }
}