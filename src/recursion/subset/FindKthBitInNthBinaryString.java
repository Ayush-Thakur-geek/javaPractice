package recursion.subset;

public class FindKthBitInNthBinaryString {
    public static void main(String[] args) {
        String s = rec("", 3);
        System.out.println(s);
    }
    public static String rec(String s, int i) {
        if (i == 1) {
            s += "0";
            return s;
        }
        s += rec(s, --i);
        String s2 = "";
        int j = (s.length()-1)/2;
        if (j != 0) {
            if (s.charAt(j) == '0') {
                s2 += s.substring(0, j) + "1" + s.substring(j+1, s.length());
            } else {
                s2 += s.substring(0, j) + "0" + s.substring(j+1, s.length());
            }
        } else {
            s2 += "1";
        }
        s += "1" + s2;

        return s;
    }
}
