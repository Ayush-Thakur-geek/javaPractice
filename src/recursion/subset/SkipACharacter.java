package recursion.subset;

public class SkipACharacter {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(skip(str));
//        skip(str, "");
    }

//    public static String skip(String up, String p) {
//        if (up.length() == 0) {
//            return p;
//        }
//        if (up.charAt(0) != 'a') {
//            p += up.charAt(0);
//        }
//        up = up.substring(1);
//        return skip(up, p);
//    }

//    public static void skip(String up, String p) {
//        if (up.length() == 0) {
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        if (ch != 'a') {
//            skip(up.substring(1), p + ch);
//        } else {
//            skip(up.substring(1), p);
//        }
//    } baccad

    public static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch != 'a') {
            return ch + skip(up.substring(1));
        } else {
            return skip(up.substring(1));
        }
    }
}
