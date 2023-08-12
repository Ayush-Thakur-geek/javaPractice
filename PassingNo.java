package com.thakur;

public class PassingNo {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n) {
        if (n==0) {
            return;
        }
        System.out.println(n);
        //fun(n--); this will give infinite recursion of value because it will first pass the value and after the function is over, it will pass the substraction.
        fun(--n);
    }
}
