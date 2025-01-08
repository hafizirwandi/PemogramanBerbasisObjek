public class ExceptionError {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Hasil resutl adalah " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
