package recursion.backtracking;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[5][5];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j< board.length; j++) {
                board[i][j] = false;
            }
        }
        System.out.println(queens(board, 0));
    }
    static int queens(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        for (int c = 0; c < board.length; c++) {
            if (isSafe(board, r, c)) {
                board[r][c] = true;
                count += queens(board, r+1);
                board[r][c] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        //vertical row
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }

        //diagonal left
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[r-i][c-i]) {
                return false;
            }
        }

        //diagonal right
        int maxRight = Math.min(r, board.length-c-1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[r-i][c+i]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
