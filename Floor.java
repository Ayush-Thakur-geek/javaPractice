package com.thakur;

import java.util.Arrays;

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        int ans =ceiling(arr, target);
        System.out.println(Arrays.toString(new int[]{ans}));
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // what if target no. is smaller than the smallest no
        if (target < arr[0]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
