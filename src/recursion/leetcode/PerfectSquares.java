package recursion.leetcode;

import java.util.ArrayList;

public class PerfectSquares {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numSquares(2));
    }
}

class Solution {
    static int min = Integer.MAX_VALUE;
    public int numSquares(int n) {
        ArrayList<Integer> l = perfectSq(n);
        minSq(n, 0, l);
        return min;
    }

    public void minSq(int n, int count, ArrayList<Integer> l) {
        if (n == 0) {
            if (min > count) {
                min = count;
            }
            return;
        }
        for (int i = 0; i < l.size(); i++) {
            if (n - l.get(i) >= 0) {
                minSq(n - l.get(i), count+1, l);
            }
        }
    }
    public ArrayList<Integer> perfectSq(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        int sq = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                sq = (int) Math.sqrt(i);
                if (sq*sq == i) {
                    l.add(i);
                }
            }
        }
        return l;
    }
}