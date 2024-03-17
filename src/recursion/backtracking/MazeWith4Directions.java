package recursion.backtracking;

public class MazeWith4Directions {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        System.out.println(ways(0, 0, maze));
//        direction("", 0, 0, maze);
        directionMatrix("", new int[3][3], 1, 0, 0, maze);
    }
    public static int ways (int i, int j, int[][] maze) {
        int count = 0;
        if (i == maze.length-1 && j == maze[0].length-1) {
            return 1;
        }
        maze[i][j] = -1;
        if (i != 0 && maze[i-1][j] != -1) {
            count += ways(i-1, j, maze);
        }
        if (i != maze.length-1 && maze[i+1][j] != -1) {
            count += ways(i+1, j, maze);
        }
        if (j != 0 && maze[i][j-1] != -1) {
            count += ways(i, j-1, maze);
        }
        if (j != maze[0].length-1 && maze[i][j+1] != -1) {
            count += ways(i, j+1, maze);
        }
        maze[i][j] = 0;
        return count;
    }

    public static void direction (String path, int i, int j, int[][] maze) {
        if (i == maze.length-1 && j == maze[0].length-1) {
            System.out.println(path);
        }
        maze[i][j] = -1;
        if (i > 0 && maze[i-1][j] != -1) {
            direction(path+"U", i-1, j, maze);
        }
        if (i < maze.length-1 && maze[i+1][j] != -1) {
            direction(path+"D", i+1, j, maze);
        }
        if (j > 0 && maze[i][j-1] != -1) {
            direction(path+"L", i, j-1, maze);
        }
        if (j < maze[0].length-1 && maze[i][j+1] != -1) {
            direction(path+"R", i, j+1, maze);
        }
        maze[i][j] = 0;
    }

    public static void directionMatrix (String path, int[][] pathArray, int step, int i, int j, int[][] maze) {
        if (i == maze.length-1 && j == maze[0].length-1) {
            System.out.println(path);
            for (int x = 0; x < pathArray.length; x++) {
                for (int y = 0; y < pathArray[0].length; y++) {
                    System.out.print(pathArray[x][y] + " ");
                }
                System.out.println();
            }
        }
        maze[i][j] = -1;
        pathArray[i][j] = step;
        if (i > 0 && maze[i-1][j] != -1) {
            directionMatrix(path+"U", pathArray, step+1, i-1, j, maze);
        }
        if (i < maze.length-1 && maze[i+1][j] != -1) {
            directionMatrix(path+"D", pathArray, step+1, i+1, j, maze);
        }
        if (j > 0 && maze[i][j-1] != -1) {
            directionMatrix(path+"L", pathArray, step+1, i, j-1, maze);
        }
        if (j < maze[0].length-1 && maze[i][j+1] != -1) {
            directionMatrix(path+"R", pathArray, step+1, i, j+1, maze);
        }
        maze[i][j] = 0;
        pathArray[i][j] = 0;
    }
}
