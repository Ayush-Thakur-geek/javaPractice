package com.thakur;

public class WealthSearchQues {
    public static void main(String[] args) {
        int[][] accounts = {
                {12,54,27},
                {34,67,76}
        };
        System.out.println(MaxWealth(accounts));
    }
    static int MaxWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int[] ints = accounts[i];
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < ints.length; account++) {
                sum += ints[account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
