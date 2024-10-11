public class ForLoop {
    public static void main(String[] args) {

        // for (int i = 6; i >= 2; i--) {
        // System.out.println("Perulangan ke -" + i);
        // i--;
        // }

        /*
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         * 
         */

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                System.out.print(j + " ");

            }

            System.out.println();
        }

    }
}
// Perulang ke - 6;
// Perulang ke - 4;
// Perulang ke - 2;
