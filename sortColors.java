package com.thakur;

import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        int i=0;
        int j=i+1;
        int k=nums.length-1;
        for (j=i;j<=k;j++) {
            if (nums[j]==0) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            } else if (nums[j]==2) {
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k--;

            } else {
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
