public class Main {
    public static void main(String[] args) {

        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut:");
        System.out.println(segitiga.totalSudut(60));
        System.out.println(segitiga.totalSudut(60, 70));

        System.out.println("\nKeliling:");
        System.out.println(segitiga.keliling(3, 4, 5));
        System.out.println(segitiga.keliling(3, 4));
    }
}