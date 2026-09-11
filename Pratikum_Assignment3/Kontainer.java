public class Kontainer {
    
    private String nomerResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer(String nomerResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomerResi = nomerResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0.0;
    }

    public String getNomerResi() {
        return nomerResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat) {
        if (this.beratMuatanSaatIni + berat > this.kapasitasMaksimal) {
            System.out.println("Gagal: Muatan melebihi kapasitas maksimal!");
        } else {
            this.beratMuatanSaatIni += berat;
            System.out.println("Berhasil menambahkan muatan sebesar " + berat + " kg.");
        }
    }

    public void turunkanMuatan(double berat) {
        double batasMaksimalUnload = 0.5 * this.beratMuatanSaatIni;

        if (berat > batasMaksimalUnload) {
            System.out.println("Sorry, for safety reasons, a single cargo unloading operation cannot exceed 50% of the current load!");
        } else if (berat <= 0) {
            System.out.println("Berat yang dibongkar harus lebih besar dari 0!");
        } else {
            this.beratMuatanSaatIni -= berat;
            System.out.println("Berhasil menurunkan muatan sebesar " + berat + " kg.");
        }
    }
}