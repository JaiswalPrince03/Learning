package BackTracking;

public class nQueen {
    // isSafe function to check if the queen can be placed in the given position
    public static boolean isSafe(int board[][], int row, int col, int n) {
        // top
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        // left diagonal
        int i = row - 1, j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }
        // right diagonal
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < n) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    // n Queen on board
    public static boolean nQ(int board[][], int row, int n) {
        if (row == n) {
            printBoard(board, n);
            return false;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                boolean canPlace = nQ(board, row + 1, n);
                if (canPlace) {
                    return true;
                }
            }
            board[row][col] = 0;
        }
        return false;

    }

    // print board
    public static void printBoard(int board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //main method
    public static void main(String[] args) {
        int n = 5;
        int board[][] = new int[n][n];
        boolean canPlace = nQ(board, 0, n);
        if (canPlace) {
            System.out.println("Queen can be placed");
        } else {
            System.out.println("Queen cannot be placed");
        }
    }

}
