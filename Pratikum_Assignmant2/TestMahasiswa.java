public class TestMahasiswa {
    
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.name = "Shevaarza";
        mhs1.nim = 101;
        mhs1.alamat = "jl wilis 2 no 2";
        mhs1.kelas = "TI 2I";

        mhs1.showbiodata();
        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.name = "irgi wahyu kaliska";
        mhs2.nim = 102;
        mhs2.alamat = "jl kendung kandang";
        mhs2.kelas = "TI 2I";

        mhs2.showbiodata();
        System.out.println();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.name = "bagas";
        mhs3.nim = 103;
        mhs3.alamat = "jl genjat mawar";
        mhs3.kelas = "TI 2I";

        mhs3.showbiodata();
    }
}
