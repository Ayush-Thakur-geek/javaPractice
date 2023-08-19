package Recursion;

public class SkipWord {
    public static void main(String[] args) {
        String s = "appapplebcd";
        System.out.println(skipApple(s, ""));
    }
    public static String skipApple(String up, String p) {
        if (up.isEmpty()) {
            return p;
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")) {
            return skipApple(up.substring(5), p);
        }
        return skipApple(up.substring(1), p+ch);
    }
}
