package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class concatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[3];
        int[] ans = new int[2 * n.length];
       for (int i = 0; i < n.length; i++) {
           n[i] = in.nextInt();
           ans[i] = n[i];
           ans[i + n.length] = n[i];
       }
        System.out.println(Arrays.toString(ans));

    }
}
