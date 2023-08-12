package com.thakur;
import java.lang.*;
public class SB {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        for (int i=0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            builder.append(ch);
//        }
//
//        System.out.println(builder.reverse());
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s);
        int n = indices.length;
        for ( int i = 0; i <n; i++ ) {
            int in = indices[i];
            s2.setCharAt(in, s1.charAt(i));

        }
        System.out.println(s2.toString());
    }
}
