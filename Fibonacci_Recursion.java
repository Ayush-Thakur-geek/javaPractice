package com.thakur;

import java.util.Scanner;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(fibo(in.nextInt()));
    }
    static int fibo(int n) {
        //base condition
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
