class OuterClass {
    static class InnerClass {
        public void informasi() {
            System.out.println("Ini adalah blok informasi dari inner class");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass in = new OuterClass.InnerClass();
        in.informasi();
    }
}
