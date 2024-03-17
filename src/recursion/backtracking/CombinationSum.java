package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CombinationSum {
    public static void main(String[] args) {
        int[] n = {2, 3, 6, 7};
        int t = 7;
        ArrayList<Integer> p = new ArrayList<>();
        System.out.println(sum(p, n, t));
    }

    public static List<List<Integer>> sum(ArrayList<Integer> p, int[] up, int target) {
        if (target == 0) {
            List<List<Integer>> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < up.length; i++) {
            if (target < up[i]) {
                break;
            } else {
                if (p.isEmpty() || p.get(p.size() - 1) <= up[i]) {
                    ArrayList<Integer> p2 = new ArrayList<>(p);
                    p2.add(up[i]);
                    ans.addAll(sum(p2, up, target - up[i]));
                }
            }
        }
        return ans;
    }

}
