package com.thakur;

public class PalindromeRecursion {
    public static void main(String[] args) {
        int x=2147483647;
        long y=palindrome(x);
        if (x<0) {
            System.out.println(false);
        } else if (x==y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    static int helper(int x) {
        int count=0;
        while (x>0) {
            x=x/10;
            count++;
        }
        return count;
    }
    static long palindrome(int x) {
        if (x%10==x) {
            return x;
        }
        int rem=x%10;
        int c=helper(x);
        return (long) (rem*(Math.pow(10,c-1)) + palindrome(x/10));
    }
}
