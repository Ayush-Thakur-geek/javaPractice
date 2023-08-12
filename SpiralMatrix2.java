package com.thakur;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] ans = matrix(n);
        System.out.println(Arrays.toString(ans));
    }
    static int[][] matrix(int n) {
        int[][] matrix= new int[n][n];
        int t = 0, l = 0, num = 0, r = n - 1, b = n -1;
        while (t <= b && l <= r) {
            for (int j = l; j <= r; j++) {
                matrix[t][j] = num++;
            }
            t += t;
            for (int i = t; i <= b; i++) {
                matrix[i][r] = num++;
            }
            r -= r;
            for (int j = r; j >= l; j--) {
                matrix[b][j] = num++;
            }
            b -= b;
            for (int i = b; i >= t; i--) {
                matrix[i][l] = num++;
            }
            l += l;
        }
        return matrix;
    }
}
