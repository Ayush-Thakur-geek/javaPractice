package com.thakur;

public class longTyped {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        System.out.println(ans(name, typed));
    }
    static boolean ans(String name, String typed) {
        int i=0;
        int j=0;
        while (i<name.length() && j<typed.length()) {
            if (name.charAt(0)!=typed.charAt(0)) {
                return false;
            }
            if (name.charAt(i)==typed.charAt(j)) {
                i++;
                j++;
                if (j<typed.length()-1 && typed.charAt(j-1)==typed.charAt(j)) {
                    j++;
                }
            } else {
                return false;
            }
        }
        if (j<typed.length()) {
            return false;
        }
        return true;
    }
}
