package com.thakur;
import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums={5,3,2,4,1};
        int i=0;
        while (i< nums.length) {
            int in=nums[i]-1;
            if (nums[i]!=nums[in]) {
                swap(nums,i,in);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
