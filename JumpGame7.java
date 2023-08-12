package com.thakur;

public class JumpGame7 {
    static boolean isPossible(String s, int min, int max) {
        int j=0;
        if (s.charAt(0)!='0') {
            return false;
        }
        int n=s.length();
        for (int i=0;i<n;) {
            if (s.charAt(i+min)=='0' && (i+min)<n) {
                j=i+min;
            }
            if ((i+max)<n && s.charAt(i+max)=='0') {
                j=i+max;
            }
            if (s.charAt(i+min)!='0' && s.charAt(i+max)!='0') {
                return false;
            }
            if (i==n-1 || i==n-1) {
                return true;
            }
            i=j;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "011010";
        int min = 2;
        int max = 3;
        boolean ans = isPossible(s, min, max);
        System.out.println(ans);
    }

}
