package com.thakur;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Ayush Thakur ", 97);

//        int ans = sum(7,8);
//        System.out.println(ans);
//        int ans2 = sum (9,7,8);
//        System.out.println(ans2);
        demo(2,3,4,5,7);
        demo("Ayush","Aryan");
    }
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static int sum (int a, int b) {
        return a + b;
    }
    static int sum (int a, int b, int c) {
        return a + b + c;
    }
//    static void fun(int a) {
//        System.out.println(a);
//    }
//    static void fun(String name, int b) {
//        System.out.println(name + b);
//    }
}
