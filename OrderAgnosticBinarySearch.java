package com.thakur;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -10, -7, -4, -3, 0, 3, 5, 7, 76, 98};
        int target = -3;
        int ans = orderAgnostics(arr, target);
        System.out.print("Position = " + ans );

    }
    static int orderAgnostics(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
