package com.thakur;

public class StringSub {
    public static void main(String[] args) {
        String a="abda";
        String b="acmc";
        int n=a.length();
        if (n<=1) {
            System.out.println(true);
        }
        int i=0;
        int j=n-1;
        boolean ans=false;
        while (i<=(n+1)/2 && j>=(n+1)/2) {
            if (a.charAt(i)==b.charAt(j)) {
                ans=true;
            } else if (a.charAt(j)==b.charAt(i)) {
                ans=true;
            } else {
                ans=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}
