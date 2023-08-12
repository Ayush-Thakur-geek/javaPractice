package com.thakur;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(MS(nums)));
    }
    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] =right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
    static int[] MS(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = MS(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MS(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
}
