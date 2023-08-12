package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutationCount("", "abc"));
    }
    static void permutation(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }
    static ArrayList<String> permutationList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
    static int permutationCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }
    static int permutationCount2(String p, String up, int count) {
        if(up.isEmpty()) {
            count +=1;
            return count;
        }
        char ch = up.charAt(0);
//        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = permutationCount2(f + ch + s, up.substring(1), count);
        }
        return count;
    }
}
