package com.thakur;

public class Shadowing {
    static int a = 20;// this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(a);//20
        int a;// the class variable is shadowed by this
//        System.out.println(a);//scope will begin when the value is initialised
        a = 30;
        System.out.println(a);//30
        fun();
    }
    static void fun() {
        System.out.println(a);
    }
}
