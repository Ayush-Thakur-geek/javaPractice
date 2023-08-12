package StringRecursion;

import org.jetbrains.annotations.NotNull;

public class Subset {
    public static void main(String[] args) {
        String up = "abc";

        String p = "";
        subSeq(p, up);
    }
    static void subSeq(String p, @NotNull String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }
}
