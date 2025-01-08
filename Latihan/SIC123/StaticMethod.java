class MathUtils {
    static int a;
    static int b;

    public MathUtils(int a, int b) {

        MathUtils.a = a;
        MathUtils.b = b;
    }

    static int addNumber(int a, int b) {
        return a + b;
    }

    static {
        System.out.println("ini adalah block static");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("a : " + MathUtils.a + " , b : " + MathUtils.b);
        MathUtils math = new MathUtils(3, 4);
        System.out.println("Jumlah 2 bilangan math adalah : " + MathUtils.addNumber(2, 4));
        System.out.println("a : " + MathUtils.a + " , b : " + MathUtils.b);

        MathUtils math2 = new MathUtils(2, 1);
        System.out.println("Jumlah 2 bilangan math2 adalah : " + MathUtils.addNumber(3, 5));
        System.out.println("a : " + MathUtils.a + " , b : " + MathUtils.b);

    }
}
