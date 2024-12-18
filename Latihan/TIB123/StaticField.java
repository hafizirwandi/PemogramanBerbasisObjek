class Counter {
    static int count = 0;

    public Counter() {
        count++;

    }
}

public class StaticField {
    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println("Jumlah count saat ini  : " + Counter.count);

        Counter count2 = new Counter();
        System.out.println("Jumlah count 2 saat ini : " + Counter.count);

        Counter count3 = new Counter();
        System.out.println("Jumlah count 3 saat ini : " + Counter.count);

    }
}
