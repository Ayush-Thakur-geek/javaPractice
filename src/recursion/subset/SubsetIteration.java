package recursion.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetIteration {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> outer = subsetDuplicate(nums);
        for (List<Integer> inner : outer) {
            System.out.println(inner);
        }
//        System.out.println(outer);
    }
    static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
//            outer.add(new ArrayList<>());
            int size = outer.size();
            for (int j = 0; j < size; j++) {
                List<Integer> inner = outer.get(j);
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
//        for (int num : nums) {
//            int size = outer.size();
//            for (int j = 0; j < size; j++) {
//                List<Integer> inner = new ArrayList<>(outer.get(j));
//                inner.add(num);
//                outer.add(inner);
//            }
//        }
        return outer;
    }
    static List<List<Integer>> subsetDuplicate(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s, e = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i-1] == nums[i]) {
                s = e + 1;
            } else {
                s = 0;
            }
            e = outer.size() - 1;
            int n = outer.size();
            for (int j = s; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}

//Time Complexity: O(n*2^n) ---> 2^n is the number of subsets and n is the time to copy the subsets
//Space Complexity: O(n*2^n) ---> 2^n is the number of subsets and n is the space to copy the subsets