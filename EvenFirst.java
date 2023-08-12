package com.thakur;
import java.util.*;

public class EvenFirst {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        Arrays.sort(nums);
        if (nums[0]%2==0) {
            for (int j=1;j<nums.length-1;j++) {
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        } else {
            for (int j=0;j<nums.length-1;j++) {
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
        System.out.println(nums);
    }
}
