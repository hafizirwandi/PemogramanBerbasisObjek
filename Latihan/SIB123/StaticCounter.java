class Counter {
    static int count = 0;

    public Counter() {
        count--;
    }
}

public class StaticCounter {
    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println("Jumlah count " + Counter.count);

    }
}
