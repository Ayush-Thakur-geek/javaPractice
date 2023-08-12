package com.thakur;

public class BinarySearch_Recursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 34, 54, 89};
        System.out.println(BS(arr,2,0, arr.length));
    }
    static int BS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] < target) {
            return BS(arr, target,m + 1, e);
        } else if (arr[m] > target) {
            return BS(arr, target, s, m - 1);
        } else {
            return m;
        }
    }
}
