public class ErrorArith {
    public static void main(String[] args) {

        // int result = 10 / 0;
        // System.out.println("Hasil dari result adalah : " + result);
        try {
            int result = 10 / 0;
            System.out.println("Hasil dari result adalah : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
