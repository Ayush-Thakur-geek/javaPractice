package Recursion;

public class SimpleStringRecursion {
    public static void main(String[] args) {
        String a = "appbaccadapplellf";
        String b = "";
//        b = (rec(a, b, a.length()-1, 0));
//        System.out.println(b);
        a = skipAppNotApple(a);
        System.out.println(a);
    }
    static String rec(String a, String b, int n, int i) {
        if (i == n && a.charAt(n) != 'a') {
            return b+a.charAt(i);
        }
        if (a.charAt(i) == 'a') {
            return rec (a, b, n, ++i);
        }
        return rec (a, b+a.charAt(i), n, ++i);
    }
    static String skip(String a) {
        if (a.isEmpty()) {
            return "";
        }
        if (a.startsWith("apple")) {
            return skip(a.substring(5));
        } else {
            return a.charAt(0) + skip(a.substring(1));
        }
    }
    static String skipAppNotApple(String a) {
        if (a.isEmpty()) {
            return "";
        }
        if (a.startsWith("app") && !a.startsWith("apple")) {
            return skipAppNotApple(a.substring(3));
        } else {
            return a.charAt(0) + skipAppNotApple(a.substring(1));
        }
    }
}
