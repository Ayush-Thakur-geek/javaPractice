package Leetcode;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board={
                {'A','B','C','E'},
                {'S','F','E','S'},
                {'A','D','E','E'}
        };
        String word="ABCB";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (word.charAt(0) == board[i][j] && search(board, word, i, j)) {
                    System.out.println(true);
                    break;
                }
            }
        }
        System.out.println(false);
    }
    public static boolean search(char[][] board, String word, int r, int c) {
        if (word.isEmpty()) {
            return true;
        }

        if (r < 0 || r >= board.length || c < 0 || c >= board[r].length || board[r][c] != word.charAt(0) || board[r][c] == '.') {
            return false;
        }
        board[r][c] = '.';
        if (search(board, word.substring(1), r+1, c)||
        search(board, word.substring(1), r-1, c)||
        search(board, word.substring(1), r, c+1)||
        search(board, word.substring(1), r, c-1)) {
            return true;
        }
        return false;
    }
}

