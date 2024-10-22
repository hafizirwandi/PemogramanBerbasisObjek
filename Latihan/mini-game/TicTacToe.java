import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        boolean gameWon = false;
        boolean draw = false;

        while (!gameWon && !draw) {
            printBoard();
            playerMove();
            gameWon = checkWin();
            draw = checkDraw();
            if (!gameWon && !draw) {
                switchPlayer();
            }
        }

        printBoard();
        if (gameWon) {
            System.out.println("Selamat! Pemain " + currentPlayer + " menang!");
        } else if (draw) {
            System.out.println("Permainan berakhir seri!");
        }
    }

    // Inisialisasi papan permainan
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Menampilkan papan permainan
    private static void printBoard() {
        System.out.println("Papan permainan:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Meminta pemain untuk melakukan gerakan
    private static void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        boolean validMove = false;

        while (!validMove) {
            System.out.println("Pemain " + currentPlayer + ", masukkan baris (0, 1, atau 2): ");
            row = scanner.nextInt();
            System.out.println("Masukkan kolom (0, 1, atau 2): ");
            col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                validMove = true;
            } else {
                System.out.println("Gerakan tidak valid, coba lagi.");
            }
        }
    }

    // Memeriksa apakah ada pemain yang menang
    private static boolean checkWin() {
        // Memeriksa baris, kolom, dan diagonal
        return (checkRows() || checkCols() || checkDiagonals());
    }

    private static boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkCols() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals() {
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    // Memeriksa apakah permainan seri (papan penuh)
    private static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Berpindah ke pemain berikutnya
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
