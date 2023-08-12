package com.thakur;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        for (int i=0;i<nums1.length;i++) {
            for (int j=0;j<nums2.length;j++) {
                if (nums1[i]==nums2[j]) {
                    System.out.println(Arrays.toString(new int[]{nums1[i]}));
                } else {
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(new int[]{-1}));
    }
}
