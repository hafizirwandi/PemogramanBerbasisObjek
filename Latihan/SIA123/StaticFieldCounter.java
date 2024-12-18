class Counter {
    public static int count = 0;

    public Counter() {
        count++;
    }
}

public class StaticFieldCounter {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        System.out.println("Count 1 sekarang ; " + Counter.count);

        Counter count2 = new Counter();
        System.out.println("Count 2 sekarang ; " + Counter.count);

        Counter count3 = new Counter();
        System.out.println("Count 3 sekarang ; " + Counter.count);
    }
}
