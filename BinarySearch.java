package com.thakur;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4,5,6,7,0,2,1,3 };
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    // return the index
    // return -1 if it doesn't exist

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2;// might be possible that (start + end) exceed the range of int in java.
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
