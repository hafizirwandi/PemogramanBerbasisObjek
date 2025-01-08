class MathUtils {
    static int a;
    static int b;

    public MathUtils(int a, int b) {

        MathUtils.a = MathUtils.a + a + 1;
        MathUtils.b = MathUtils.b + b + 1;
    }

    static int addNumber(int a, int b) {
        return a + b;
    }

    static {
        System.out.println("ini adalah blok statik");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        MathUtils math = new MathUtils(1, 2);
        System.out.println("Penjumlahan math saat ini " + MathUtils.addNumber(1, 3));

        MathUtils math2 = new MathUtils(5, 3);
        System.out.println("Penjumlahan math2 saat ini " + MathUtils.addNumber(2, 4));

        MathUtils math3 = new MathUtils(5, 3);
        System.out.println("Penjumlahan math3 saat ini " + MathUtils.addNumber(2, 4));
    }
}
