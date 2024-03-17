package recursion.subset;

public class Ascii {
    public static void main(String[] args) {
        String str = "abc";
        rec(str, "");
        for (int i = 0; i < str.length(); i++) {

        }
    }

    public static void rec(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        rec(up.substring(1), p+ch);
        rec(up.substring(1), p+(ch + 0));
        rec(up.substring(1), p);
    }
}
