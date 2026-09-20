package classrelation.casestudy;

public class MainCaseStudy {
    public static void main(String[] args) {
    
        Clinic sehat = new Clinic("Klinik Sehat", 3);
        Clinic prima = new Clinic("Klinik Prima", 2);


        Doctor andi = new Doctor("dr. Andi", "Umum");
        Doctor sari = new Doctor("dr. Sari", "Gigi");
        sehat.addDoctor(andi);
        sehat.addDoctor(sari);


        Patient budi = new Patient("Budi", "demam");
        Patient citra = new Patient("Citra", "sakit gigi");

        System.out.println("=== Pasien masuk ===");
        System.out.println(budi.getName() + " -> ruang " + sehat.admitPatient(budi));
        System.out.println(citra.getName() + " -> ruang " + sehat.admitPatient(citra));

        System.out.println();
        System.out.println("=== Pemeriksaan ===");
        Prescription rx1 = andi.examine(budi);
        Prescription rx2 = sari.examine(citra);
        System.out.println(rx1.info());
        System.out.println(rx2.info());

        System.out.println();
        System.out.println("=== Kondisi awal ===");
        System.out.println(sehat.info());
        System.out.println(prima.info());

        sehat.removeDoctor(sari);
        prima.addDoctor(sari);

        System.out.println("=== Setelah dr. Sari pindah ke Klinik Prima ===");
        System.out.println(sehat.info());
        System.out.println(prima.info());
    }
}
