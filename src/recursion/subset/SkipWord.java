package recursion.subset;

public class SkipWord {
    public static void main(String[] args) {
        String str = "gheapplevimapplre";
        System.out.println(skip(str, ""));
    }

    public static String skip(String up, String p) {
        if (up.isEmpty() || up.length() < 5) {
            return up;
        }
        String str = up.substring(0, 5);
        if (str.equals("apple")) {
            return skip(up.substring(5), p);
        } else if (str.startsWith("app")) {
            return ('$' + skip(up.substring(1), p));
        }
        return up.charAt(0) + skip(up.substring(3), p);
    }
}
