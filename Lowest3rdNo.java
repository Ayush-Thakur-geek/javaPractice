package com.thakur;

public class Lowest3rdNo {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        int i=0;
        int end=nums.length-1;
        while (i< nums.length) {
            int in=nums[i]-1;
            if (nums[i]!=nums[in]) {
                swap(nums,i,in);
            } else {
                i++;
            }
        }
        if (nums.length>3) {
            for (int j=0;j<nums.length;j++) {
                if (nums[j]!=j+1) {
                    end=end-1;
                    System.out.println(nums[end-2]);
                }
            }
            System.out.println(nums[end-2]);
        }
        System.out.println(nums[0]);
    }
    static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
