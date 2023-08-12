package com.thakur;

import java.util.Arrays;

public class sum_Array {
    public static void main(String[] args) {
        int[] arr={2,5,5,11};
        int target=10;
        System.out.println(Arrays.toString(sum(arr,target)));
    }
    static int[] sum(int[] arr, int target) {
        for (int i=0;i<arr.length;i++) {
            for (int j=1;j<arr.length;j++) {
                if (arr[i]+arr[j]==target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
