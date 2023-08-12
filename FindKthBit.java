package Leetcode.Recursion;

public class FindKthBit {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
//        String binary = Bit(n, k, "");
//        System.out.println(binary.charAt(k-1));
        StringBuilder binary = new StringBuilder("0");

        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder(binary);
            binary.append('1');
            for (int j = temp.length() - 1; j >= 0; j--) {
                binary.append(temp.charAt(j) == '0' ? '1' : '0');
            }
        }

        System.out.println(binary.charAt(k - 1));
    }
    public static String Bit(int n, int k, String bit) {
        if (n == 1) {
            return (bit += 0);
        }
        bit = Bit(--n, k, bit);
        return bit + "1" + inv(bit);
    }
    public static String inv(String bit) {
        String invBit = "";
        for (int i = 0; i < bit.length(); i++) {
            if (bit.charAt(i) == '0') {
                invBit += 1;
            } else {
                invBit += 0;
            }
        }
        return rev(invBit);
    }
    public static String rev(String invBit) {
        String revBit = "";
        for (int i = invBit.length() - 1; i >= 0; i--) {
            revBit += invBit.charAt(i);
        }
        return revBit;
    }
}
