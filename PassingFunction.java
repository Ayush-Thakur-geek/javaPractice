package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class PassingFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = {3,4,5,6,7};
        System.out.println(Arrays.toString(n));
        change(n);
        System.out.println(Arrays.toString(n));
    }
    static void change(int[] arr) {
        arr[0] = 12;
    }
}
