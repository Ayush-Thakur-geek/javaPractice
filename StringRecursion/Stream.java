package StringRecursion;

import org.jetbrains.annotations.NotNull;

public class Stream {
    public static void main(String[] args) {
        String up = "appappleappsuiiii";
//        String p = "";
//        skip1(p, up);
//        System.out.println(skip2(up));
        System.out.println(skipApple(up));
        System.out.println(skipAppNotApple(up));
    }
    static void skip1(String p, @NotNull String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip1(p, up.substring(1));
        } else {
            skip1(p + ch, up.substring(1));
        }
    }
    static String skip2(@NotNull String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }
    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skip2(up.substring(5));
        } else {
            return up.charAt(0) + skip2(up.substring(1));
        }
    }
    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
