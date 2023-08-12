package com.thakur;

import java.util.Scanner;

public class MinSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {18,12,-7,3,14,28};

        System.out.println(Min(arr));

    }
    static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
