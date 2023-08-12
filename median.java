package com.thakur;

public class median {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        int[] nums=new int[c];
        for (int i=0;i<a;i++) {
            nums[i]=nums1[i];
        }
        for (int j=0;j<b;j++) {
            nums[j+a]=nums2[j];
        }
        boolean swapped;
        for (int i = 0;i<c;i++) {
            swapped=false;
            for (int j = 1;j<c-i;j++) {
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        int start=0;
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        double median;
        if (end%2==0) {
            median=nums[mid];
        } else {
            median=(double) (nums[mid]+nums[mid+1])/2;
        }
        System.out.println(median);
    }
}
