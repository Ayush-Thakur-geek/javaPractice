package com.thakur;

public class MountainArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,3,1};
        int target=2;
        int peak=peak(nums,target);
        int a1=BS(target,nums,0,peak);
        int a2=revBS(target,nums,peak, nums.length-1);
        if (a1==-1) {
            int temp=a1;
            a1=a2;
            a2=temp;
        }
        System.out.println(a1);
    }
    static int peak(int[] nums,int target) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            } else {
                start=mid+1;
            }
        }
        return end;
    }
    static int BS(int target,int[] nums,int start,int end) {
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (nums[mid]==target) {
                return mid;
            } else if (nums[mid]<target) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return -1;
    }
    static int revBS(int target, int[] nums,int start,int end) {
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (nums[mid]==target) {
                return mid;
            } else if (nums[mid]<target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }
}
