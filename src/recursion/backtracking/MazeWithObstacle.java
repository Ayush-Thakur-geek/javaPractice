package recursion.backtracking;

public class MazeWithObstacle {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        maze[1][1] = 1;
        System.out.println(ways(2,2,maze));
    }
    public static int ways (int i, int j, int[][] maze) {
        if (i == 0 || j == 0) {
            return 1;
        }
        if (maze[i][j] == 1) {
            return 0;
        }
        int  l = ways(i-1, j, maze);
        int r = ways(i, j-1, maze);
        return l+r;
    }
}
