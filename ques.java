package com.thakur;

public class ques {
    public static void main(String[] args) {
        String s="0110111";
        int result=0;
        int count=0;
        int mod=1_000_000_007;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='1') {
                count++;
            } else {
                count=0;
            }
            result=(result+count)%mod;
        }
        System.out.println(result);
    }
}
