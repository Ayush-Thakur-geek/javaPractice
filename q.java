package com.thakur;

public class q {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{4,5,6}};
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int[] n = accounts[i];
            int sum = 0;
            for (int j = 0; j < n.length; j++) {
                sum += n[j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}
