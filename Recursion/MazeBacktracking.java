package Recursion;

import java.util.Arrays;

public class MazeBacktracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allDirectionPrint("", board, 0, 0, path, 1);
    }
    static void allDirection(String p, boolean[][] arr, int r, int c) {
        if (r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(p);
            return;
        }
        if (arr[r][c] == false) {
            return;
        }
        arr[r][c] = false;
        if (c < arr[0].length-1) {
            allDirection(p + "R", arr, r, c+1);
        }
        if (r < arr.length-1) {
            allDirection(p + "D", arr, r+1, c);
        }
        if (r > 0) {
            allDirection(p + "U", arr, r-1, c);
        }
        if (c > 0) {
            allDirection(p + "L", arr, r, c-1);
        }
        arr[r][c] = true;
    }
    static void allDirectionPrint(String p, boolean[][] maze, int r, int c,int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allDirectionPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allDirectionPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allDirectionPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allDirectionPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
