package com.thakur;
import java.util.*;

public class Max3rd {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        System.out.println(Max3rd(nums));
    }
    static int Max3rd(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            if (i==0 || nums[i]!=nums[i-1]) {
                l.add(nums[i]);
            }
        }
        int[] arr=new int[l.size()];
        for (int i=0;i<arr.length;i++) {
            arr[i]=l.get(i);
        }
        if (arr.length>=3) {
            return arr[2];
        }
        return arr[l.size()];
    }
}
