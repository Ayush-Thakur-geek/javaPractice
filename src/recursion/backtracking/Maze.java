package recursion.backtracking;

public class Maze {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];
//        System.out.println(ways(3,3));
//        directions(3,3,"");
        directions3Way(3,3,"");
    }
    public static int ways (int i, int j) {
        if (i == 1 || j == 1) {
            return 1;
        }
        int l = ways(i-1, j);
        int r = ways(i, j-1);
        return l+r;
    }

    public static void directions (int i, int j, String path) {
        if (i == 1 && j == 1) {
            System.out.println(path);
        }
        if (i != 1) {
            directions(i-1, j, path+"D");
        }
        if (j != 1) {
            directions(i, j-1, path+"R");
        }
    }

    public static void directions3Way (int i, int j, String path) {
        if (i == 1 && j == 1) {
            System.out.println(path);
        }
        if (i != 1) {
            directions3Way(i-1, j, path+"V");
        }
        if (j != 1) {
            directions3Way(i, j-1, path+"H");
        }
        if (i != 1 && j != 1) {
            directions3Way(i-1, j-1, path+"D");
        }
    }
}
