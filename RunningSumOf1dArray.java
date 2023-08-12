package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        n[0] = in.nextInt();
        int[] ans = new int[n.length];
        ans[0] = n[0];
        for (int i = 1; i < n.length; i++) {
            n[i] = in.nextInt();
            ans[i] = ans[i - 1] + n[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
