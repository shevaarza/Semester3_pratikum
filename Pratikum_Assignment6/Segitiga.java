public class Segitiga {

    private int sudut;

    // Overloading 1
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // Overloading 2
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Overloading 3
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading 4
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }
    
}