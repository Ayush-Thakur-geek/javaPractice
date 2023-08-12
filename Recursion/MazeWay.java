package Recursion;

import java.util.ArrayList;
import java.util.List;

public class MazeWay {
    public static void main(String[] args) {
//        System.out.println(mazeCount(3, 3));
        mazePath("", 3, 3);
        System.out.println(mazePathList2("", 3, 3));
        mazePathDiag("", 3, 3);
    }
    static int mazeCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int count = mazeCount(r-1, c) + mazeCount(r, c-1);
        return count;
    }
    static void mazePath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            mazePath(p + "D", r-1, c);
        }
        if (c > 1) {
            mazePath(p + "R", r, c-1);
        }
    }
    static List<String> mazePathList(String p, int r, int c, ArrayList<String> list) {
        if (r == 1 && c == 1) {
            list.add(p);
            return list;
        }
        if (r > 1) {
            mazePathList(p + "D", r-1, c, list);
        }
        if (c > 1) {
            mazePathList(p + "R", r, c-1, list);
        }
        return list;
    }
    static List<String> mazePathList2(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(mazePathList2(p + "D", r-1, c));
        }
        if (c > 1) {
            ans.addAll(mazePathList2(p + "R", r, c-1));
        }
        return ans;
    }
    static void mazePathDiag(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            mazePath(p + "D", r-1, c);
        }
        if (c > 1) {
            mazePath(p + "R", r, c-1);
        }
        if (r>1 && c>1) {
            mazePathDiag(p + "Diag", r-1, c-1);
        }
    }
}