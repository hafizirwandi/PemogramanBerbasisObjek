class Counter {
    static int count = 2;

    public Counter() {
        // count++;
        count = count + 1;
    }

}

public class StaticField {
    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println("Count saat ini adalah : " + Counter.count);

        Counter count2 = new Counter();
        System.out.println("Count2 saat ini adalah : " + Counter.count);

        Counter count3 = new Counter();
        System.out.println("Count3 saat ini adalah : " + Counter.count);
    }
}
