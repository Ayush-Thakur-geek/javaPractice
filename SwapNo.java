package com.thakur;

import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(swap(n));
    }
    static int digits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    static int count = 0;
    static int swap(int n) {
        int digits = digits(n);
        count++;
        int pow = (int) Math.pow(10,digits - 1);
        if (count == 1) {
            int rem = n % 10;
            return (int) (rem * pow + swap(n / 10));
        } else if (n % 10 == n) {
            return n;
        }
        int rem = n % pow;
        return rem * 10 + swap(n / pow);
    }
}
