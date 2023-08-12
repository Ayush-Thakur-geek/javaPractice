package com.thakur;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        int ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > ans) {
                System.out.println("False");
            }
            ans = Math.max(ans, i + nums[i]);
        }
        System.out.println("True");
    }
}
