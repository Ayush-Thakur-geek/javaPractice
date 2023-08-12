package com.thakur;

import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n) {
        int c = 2;
        if (n <= 1) {
            return false;
        }
        while (c*c <= n) {
            if (n%c==0) {
                return false;
            }
            c++;
        }
        return true ;
    }
}
