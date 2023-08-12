package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("No. of values in 1st: ");
        int n1 = in.nextInt();
        System.out.print("No. of values in 2nd: ");
        int n2 = in.nextInt();
        int n3 = n1 + n2;
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n3];
        System.out.println("Enter " + n1 + " values of a: ");
        for (int i = 0; i < n1; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter " + n2 + " values of b: ");
        for (int i = 0; i < n2; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            c[i] = a[i];
            for (int j = 1; j < n2; j++) {
                c[j + n2] = b[j];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
