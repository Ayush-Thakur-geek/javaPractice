package com.thakur;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        int[] ans=merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[] nums1,int m,int[] nums2,int n) {
        int[] nums=new int[m+n];
        for (int i=0;i<m;i++) {
            nums[i]=nums1[i];
        }
        for (int j=0;j<n;j++) {
            nums[m+j]=nums2[j];
        }
        boolean swapped;
        for (int i=0;i<nums.length;i++) {
            swapped=false;
            for (int j=1;j<nums.length-i;j++) {
                if (nums[j]<nums[j-1]) {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=false;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return nums;
    }
}

