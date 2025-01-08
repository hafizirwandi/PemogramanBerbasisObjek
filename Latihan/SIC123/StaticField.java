class Counter {
    static int count;

    public Counter() {
        // count++;
        count = count + 1;

    }
}

public class StaticField {
    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println("Jumlah count saat ini : " + Counter.count);

        Counter count2 = new Counter();
        System.out.println("Jumlah count2 saat ini : " + Counter.count);

        Counter count3 = new Counter();
        System.out.println("Jumlah count3 saat ini : " + Counter.count);
    }
}
