package Recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        String s = "baccad";
        System.out.println(rec(s, ""));
    }
    public static String rec(String up, String p) {
        if (up.isEmpty()) {
            return p;
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            return rec(up.substring(1), p);
        }
        return rec(up.substring(1), p + up.substring(0,1));
    }
}
