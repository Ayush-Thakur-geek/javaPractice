package com.thakur;

import java.util.Scanner;

public class RangeSearching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = {18,12,-7,3,14,28};
        int target = in.nextInt();
        int ans = Range(n, target, 1, 4);
        System.out.println(ans);
    }
    static int Range(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int no = arr[i];
            if (no == target) {
                return i;
            }
        }
        return -1;
    }
}
