class StaticBlock {

    public StaticBlock() {
        System.out.println("ini adala construct dari StaticBlock");
    }

    static {
        System.out.println("ini adala blok statik dari StaticBlock");
    }
}

public class StaticBlockCounter {

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
    }
}