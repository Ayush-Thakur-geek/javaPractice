package Recursion;

public class MazeObstackle {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (i == 1 && j == 1) {
                    maze[i][j] = false;
                } else {
                    maze[i][j] = true;
                }
            }
        }
        PathClose("", maze, 0, 0);
    }
    static void PathClose(String p, boolean[][] arr, int r, int c) {
        if (r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(p);
            return;
        }
        if (arr[r][c] == false) {
            return;
        }
        if (c < arr[0].length-1) {
            PathClose(p + "R", arr, r, c+1);
        }
        if (r < arr.length-1) {
            PathClose(p + "D", arr, r+1, c);
        }

    }
}
