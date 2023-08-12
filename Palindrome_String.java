package com.thakur;
import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char i = '1';
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i<n.length(); i++) {
//            char ch = n.charAt(i);
//            builder.append(ch);
//        }
//        boolean ans = false;
//        for (int i = 0; i<n.length(); i++) {
//            if (builder.reverse().charAt(i) == n.charAt(i)) {
//                ans = true;
//            } else {
//                ans = false;
//            }
//        }
//        System.out.println(ans);
        System.out.println(palindrome(n));
        System.out.println(i);
    }
    static boolean palindrome(String n) {
        int start = 0;
        int end = n.length()-1;
        if (n.length() == 0 || n == null) {
            return true;
        }
        while (start < end) {
            if (n.charAt(start) != n.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
