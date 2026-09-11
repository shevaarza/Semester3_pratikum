import java.util.Scanner;

public class TestLogistik {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-312132", "PT Sangar Darjo", 5000);

        System.out.println("Nama Pemilik Kontainer : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal     : " + kontainerAlfa.getKapasitasMaksimal() + " KG");
        System.out.println("--------------------------------------------------");

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== MENU OPERASI KONTAINER ===");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Bongkar / Turunkan Muatan");
            System.out.println("3. Cek Status Muatan Saat Ini");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan berat muatan yang ingin ditambahkan (KG): ");
                    double beratTambah = scanner.nextDouble();
                    kontainerAlfa.tambahMuatan(beratTambah);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " KG");
                    break;

                case 2:
                    System.out.print("Masukkan berat muatan yang ingin dibongkar (KG): ");
                    double beratBongkar = scanner.nextDouble();
                    kontainerAlfa.turunkanMuatan(beratBongkar);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " KG");
                    break;

                case 3:
                    System.out.println("Status muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " / " + kontainerAlfa.getKapasitasMaksimal() + " KG");
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Sesi logistik selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }
}