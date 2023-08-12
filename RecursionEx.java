package com.thakur;

public class RecursionEx {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // this is called the last statement
        // this is the last function call
        print(n+1);
    }
}
