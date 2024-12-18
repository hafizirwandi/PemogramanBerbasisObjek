class MathUtils {
    static int a;
    static int b;

    public MathUtils(int a, int b) {

        MathUtils.a = MathUtils.a + a;
        MathUtils.b = MathUtils.b + b;
    }

    public MathUtils() {
        System.out.println("ini adalah construct");
    }

    static int addNumber() {
        return a + b;
    }

    static int minNumber(int a, int b) {
        return a - b;
    }

    static {
        System.out.println("ini adalah blok static");
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        // MathUtils math = new MathUtils(1, 3);
        // System.out.println("Jumlah 2 bil adalah : " + MathUtils.addNumber());

        // MathUtils math2 = new MathUtils(3, 5);
        // System.out.println("Jumlah 2 bil adalah : " + MathUtils.addNumber());
        // MathUtils.a = MathUtils.a + 2;

        // MathUtils math3 = new MathUtils(3, 5);
        // System.out.println("Jumlah 2 bil adalah : " + MathUtils.addNumber());

        MathUtils math4 = new MathUtils();
        // System.out.println("Jumlah 2 bil adalah : " + MathUtils.addNumber());
        // System.out.println("Pengurangan 2 bil adalah : " + MathUtils.minNumber(4,
        // 5));

    }
}