package recursion.subset;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "aab";
//        permute("", str);
        System.out.println(permute2("", str));
        System.out.println(permuteCount("", str));
    }
    static void permute(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            String f  = p.substring(0, i);
            String s = p.substring(i, p.length());
            permute(f+up.charAt(0)+s, up.substring(1));
        }
    }
    static ArrayList<String> permute2(String p, String up) {
        ArrayList<String> global = new ArrayList<>();
        if (up.isEmpty()) {
            ArrayList<String> local = new ArrayList<>();
            local.add(p);
            return local;
        }
        for (int i = 0; i <= p.length(); i++) {
            String f  = p.substring(0, i);
            String s = p.substring(i, p.length());
            global.addAll(permute2(f+up.charAt(0)+s, up.substring(1)));
        }
        return global;
    }
    static int permuteCount(String p, String up) {
        int count = 0;
        if (up.isEmpty()) {
            return 1;
        }
        for (int i = 0; i <= p.length(); i++) {
            String f  = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permuteCount(f+up.charAt(0)+s, up.substring(1));
        }
        return count;
    }
}
