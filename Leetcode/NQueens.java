package Leetcode;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board, 0));
    }
    static int queen(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        //placing the queen and checking for every row and column

        int count = 0;
        for (int c = 0; c < board.length; c++) {
            //place the queen if it is safe
            if (isSafe(board, r, c)) {
                board[r][c] = true;
                count += queen(board, r+1);
                board[r][c] = false;
            }

        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int r, int c) {
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
    private static void display (boolean[][] board) {
        for (boolean[] r : board) {
            for (boolean element : r) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
