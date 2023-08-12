package com.thakur;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> l=new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i]<nums2[j]) {
                i++;
            } else if (nums1[i]>nums2[j]) {
                j++;
            } else {
                if (k==0 || l.get(k-1)!=nums2[j]) {
                    l.add(nums2[j]);
                }
                i++;
                j++;
            }
        }
        int[] arr=new int[l.size()];
        for (int v=0;v<l.size();v++) {
            arr[v]=l.get(v);
        }
        System.out.println(Arrays.toString(arr));
    }
}
