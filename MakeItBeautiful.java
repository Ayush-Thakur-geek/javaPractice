package com.thakur;

import java.util.Scanner;

public class MakeItBeautiful {
    static void BS(int[] nums) {
        boolean swapped;
        for (int i=0;i<nums.length;i++) {
            swapped=false;
            for (int j=1;j<nums.length-i;j++) {
                if (nums[j]>nums[j-1]) {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    static void swap(int[] nums,int k) {
        System.out.println("YES");
        BS(nums);
        if (nums[0]==nums[1]) {
            int temp=nums[0];
            nums[0]=nums[k-1];
            nums[k-1]=temp;
        }
        for (int j=0;j< nums.length;j++) {
            System.out.print(nums[j]+" ");
        }
        System.out.println();
    }
    static void Check(int[] nums,int k) {
        boolean check = true;
        for (int j=0;j<k-1;j++) {
            if (nums[j]==nums[j+1]) {
                check=true;
                continue;
            }
            if (nums[j]!=nums[j+1]) {
                check=false;
                break;
            }
        }
        if (check!=true) {
            swap(nums,k);
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        int test=in.nextInt();
        while (count<test) {
            int k = in.nextInt();
            int[] nums = new int[k];
            for (int i = 0; i < k; i++) {
                nums[i] = in.nextInt();
            }
            Check(nums,k);
            count++;
        }
    }
}
