package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int lI = 0;
        int rI = 0;
        int mI = 0;
        while (lI < left.length && rI < right.length) {
            if (left[lI] < right[rI]) {
                merged[mI] = left[lI];
                lI++;
            } else {
                merged[mI] = right[rI];
                rI++;
            }
            mI++;
        }
        if (lI < left.length) {
            while (lI < left.length) {
                merged[mI] = left[lI];
                lI++;
                mI++;
            }
        } else {
            while (rI < right.length) {
                merged[mI] = right[rI];
                rI++;
                mI++;
            }
        }
        return merged;
    }
}
