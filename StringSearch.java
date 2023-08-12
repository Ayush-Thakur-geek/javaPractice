package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String name = in.nextLine();
        char target = 'u';
        System.out.println(search2(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search2(String str, char target) {
        if (str.length() == 0) { // str.length() here length is a function so we put brackets.
            return false;
        }
        for (char ch: str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) { // str.length() here length is a function so we put brackets.
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
