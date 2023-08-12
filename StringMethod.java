package com.thakur;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Ayush Thakur";
        System.out.println(Arrays.toString((name.toCharArray())));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('T'));
        System.out.println(name.trim());
        System.out.println(Arrays.toString((name.split(" "))));
    }
}
