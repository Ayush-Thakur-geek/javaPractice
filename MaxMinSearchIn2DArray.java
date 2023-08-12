package com.thakur;

import java.util.Arrays;

public class MaxMinSearchIn2DArray {
    public static void main(String[] args) {
        int[][] n = {
                {12,3,45},
                {34,13,56,76,44},
                {57,23}
        };
        System.out.println(Arrays.toString(Min(n)));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    static int[] Min(int[][] n) {
        int min = n[0][0];
        for (int row = 0; row < n.length; row++) {
            for (int col = 0; col < n[row].length; col++) {
                if (n[row][col] < min) {
                    min = n[row][col];
                }
            }
        }
        return new int[]{min};
    }
}
