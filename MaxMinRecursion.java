package com.thakur;

public class MaxMinRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println("max = " + Max(arr, arr[0], 0));
        System.out.println("min = " + Min(arr, arr[0], 0));
    }
    static int Max(int[] arr, int max, int i) {
        if (i == arr.length - 2) {
            return max;
        }
        if (arr[i + 1] > max) {
            max = arr[i + 1];
        }
        return Max(arr, max, i + 1);
    }
    static int Min(int[] arr, int min, int i) {
        if (i == arr.length - 2) {
            return min;
        }
        if (arr[i + 1] < min) {
            min = arr[i + 1];
        }
        return Min(arr, min, i + 1);
    }
}
