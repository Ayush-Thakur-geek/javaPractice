package com.thakur;

public class Mirror {
    public static void main(String[] args) {
        int n = 23597;
        int x = n;
        int ans = 0;
        while (x>0) {
            int rem = x % 10;
            x = x/ 10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }
}
