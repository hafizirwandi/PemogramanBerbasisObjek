
class MathUtils {
    static int a;
    static int b;

    public MathUtils(int a, int b) {
        MathUtils.a = MathUtils.a + a;
        MathUtils.b = MathUtils.b + b;
    }

    static int addNumber(int a, int b) {
        return a + b;
    }

    static {
        System.out.println("ini adalah static");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        MathUtils math = new MathUtils(1, 3);
        System.out.println("Jumlah 2 bilangan adalah : " + MathUtils.addNumber(2, 5));

        MathUtils math2 = new MathUtils(5, 2);
        System.out.println("Jumlah 2 bilangan adalah : " + MathUtils.addNumber(3, 5));

        MathUtils math3 = new MathUtils(1, 4);
        System.out.println("Jumlah 2 bilangan adalah : " + MathUtils.addNumber(1, 1));
    }
}
