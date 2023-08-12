package Leetcode;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        boolean[] pos = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pos[i] = true;
        }
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        System.out.println(sum(result, cur, pos, arr,  7));
    }
    static List<List<Integer>> sum(List<List<Integer>> result, List<Integer> cur, boolean[] pos, int[] arr, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
            return result;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target && pos[i] == true) {
                cur.add(arr[i]);
                sum(result, cur, pos, arr, target - arr[i]);
                pos[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
        return result;
    }
}
