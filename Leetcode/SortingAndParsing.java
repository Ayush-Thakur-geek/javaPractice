package Leetcode;

import java.util.Arrays;

public class SortingAndParsing {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int i = 0;
        int j = nums.length-1;
        while (i <= nums.length-1 && j >= 0) {
            if (nums[i]%2 == 0) {
                i+=2;
            } else if (nums[j]%2 == 1) {
                j-=2;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
