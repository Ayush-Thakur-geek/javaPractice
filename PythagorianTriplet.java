package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class PythagorianTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = in.nextInt();
        n[1] = in.nextInt();
        n[2] = in.nextInt();
        System.out.println(Arrays.toString(n));
        int max = n[0];
        if (n[1] > n[0]) {
            max = n[1];
        }
        if (n[2] > max) {
            max = n[2];
        }
        System.out.println(max);
        if (max == n[0]) {
            System.out.println((n[1] * n[1]) + (n[2] * n[2]) == (n[0] * n[0]) );// or we can use boolean
        }
        if (max == n[1]) {
            System.out.println((n[0] * n[0]) + (n[2] * n[2]) == (n[1] * n[1]) );
        }
        if (max == n[2]) {
            System.out.println((n[0] * n[0]) + (n[1] * n[1]) == (n[2] * n[2]) );
        }
    }
}