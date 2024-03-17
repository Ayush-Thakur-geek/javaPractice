package recursion.leetcode;

public class PathWithMaxGold {
    public static void main(String[] args) {
        int[][] grid = {{34,0,1,0,0,0},{0,0,2,0,1,0},{5,4,3,7,4,2},{0,0,5,0,1,4},{0,0,5,0,2,3}};
        Test t = new Test();
        System.out.println(t.getMaximumGold(grid));
    }
}

class Test {
    static int max = 0;
    public int getMaximumGold(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                } else {
                    path(grid, i, j, 0);
                }
            }
        }
        return max;
    }

    public void path(int[][] grid, int i, int j, int sum) {
        int val = grid[i][j];

        grid[i][j] = 0;
        if (j > 0 && grid[i][j-1] != 0) {
            path(grid, i, j-1, sum + val);
        }
        if (i > 0 && grid[i-1][j] != 0) {
            path(grid, i-1, j, sum + val);
        }
        if (i < grid.length - 1 && grid[i+1][j] != 0) {
            path(grid, i+1, j, sum + val);
        }
        if (j < grid[i].length-1 && grid[i][j+1] != 0) {
            path(grid, i, j+1, sum + val);
        }
        sum += val;
        grid[i][j] = val;
        if (max < sum) {
            max = sum;
        }
    }
}