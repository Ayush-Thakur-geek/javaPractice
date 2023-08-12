package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = {0,2,1,5,3,4};
        int[] ans = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            ans[i] = n[n[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
//    static int[] isPermutation(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < arr.length; i++) {6
//            arr[i] = arr[arr[i]];
//
//        }
//
//    }
}
