package com.thakur;

public class ElectricityBill {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        int i=0;
        int j=0;
        int k=0;
        int[] nums=new int[nums1.length+nums2.length];
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i]<nums2[j]) {
                nums[k]=nums1[i];
                i++;
                k++;
            } else {
                nums[k]=nums2[j];
                j++;
                k++;
            }
        }
        while (i<nums1.length) {
            nums[k]=nums[i];
            i++;
            k++;
        }
        while (j<nums2.length) {
            nums[k]=nums2[j];
            j++;
            k++;
        }
        double median=0.0;
        int start=0;
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        if (end%2==0) {
            median=nums[mid];
        } else {
            median=(double) (nums[mid]+nums[mid+1])/2;
        }
        System.out.println(median);
    }
}
