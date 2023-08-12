package Leetcode;

import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
//        if (letters("", "").size() == 1) {
//            letters("", "").remove(0);
//            System.out.println(letters("", ""));;
//        }
        System.out.println(letters("", ""));
    }
    static ArrayList<String> letters(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int a = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (a-1)*3; i < a*3; i++) {
            if (i == 26) {
                break;
            }
            char d = (char) ('a'+i);
            ans.addAll(letters(p+d, up.substring(1)));
        }
        return ans;
    }
}

