package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int[] num = new int[2*n];
        for(int v = 0; v < num.length; v++) {
            num[v] = in.nextInt();
        }
        int[] result = Shuffling(num,n);
        System.out.println(Arrays.toString(result));
    }
    static int[] Shuffling(int[] num, int n) {
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length - 1; i += 2) {
            ans[i] = num[i];
        }
        for (int j = 1; j < num.length; j += 2) {
            ans[j] = num[j];
        }
        return ans;
    }
}