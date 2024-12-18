class MathUtils {
    static int a = 1;

    public MathUtils() {
        a++;
    }

    static int penjumlahan(int b) {
        return a + b;
    }
}

public class StaticMethodMathUtils {

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        MathUtils math2 = new MathUtils();
        // System.out.println("Hasil dari penjumlahan 10 + 9 = " +
        // MathUtils.penjumlahan(10, 9));
        System.out.println("Hasil dari penjumlahan 10 + 9 = " + MathUtils.penjumlahan(9));
    }
}