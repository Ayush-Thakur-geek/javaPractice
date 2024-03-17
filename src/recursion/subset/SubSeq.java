package recursion.subset;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(rec3("", str, new ArrayList<>()));
        System.out.println(rec("", str));
    }

    public static ArrayList<String> rec(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> left = rec(p+up.charAt(0), up.substring(1));
        ArrayList<String> right = rec(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void rec2(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        rec2(p+up.charAt(0), up.substring(1));
        rec2(p, up.substring(1));
    }

    public static ArrayList<String> rec3(String p, String up, ArrayList<String> l) {
        if (up.isEmpty()) {
            l.add(p);
            return l;
        }
        rec3(p+up.charAt(0), up.substring(1), l);
        rec3(p, up.substring(1), l);
        return l;
    }
}
