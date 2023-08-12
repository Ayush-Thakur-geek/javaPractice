package com.thakur;

public class Intersection {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int i=0;
        while (i< nums.length) {
            int in=nums[i]-1;
            if (nums[i]!=nums[in]) {
                swap(nums,i,in);
            } else {
                i++;
            }
        }
        int start=0;
        int end=nums.length-1;
        for (int j=0;j<nums.length;j++) {
            if (nums[j]!=j+1) {
                end=end-1;
                if (nums.length>3) {
                    System.out.println(nums[end-2]);
                } else if (nums.length==3) {
                    System.out.println(nums[start]);
                } else {
                    System.out.println(nums[end]);
                }
            }
        }
        if (nums.length>3) {
            System.out.println(nums[end-2]);
        } else if (nums.length==3) {
            System.out.println(nums[start]);
        } else {
            System.out.println(nums[end]);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
