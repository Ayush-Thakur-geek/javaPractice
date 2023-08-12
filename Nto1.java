package com.thakur;

public class Nto1 {
    public static void main(String[] args) {
        rev(4);
//        f(5);
    }
    static void rev(int n) {
        if (n<0) {
            return;
        }
        System.out.println(n);
        rev(n-1);
        System.out.println(n);
    }
    static void f(int n) {
        if (n<0) {
            return;
        }
        System.out.println(n);
        f(n-1);
    }
}
