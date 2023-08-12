package Leetcode;

public class Zig_Zag {
    public static void main(String[] args) {
        String s = "A";
        int n = 2;
        if (n == 1 || s.length() == 1) {
            System.out.println(s);
        } else {
            int i = 0;
            String s2 = "" + s.charAt(0);

            while (i < n) {
                int j = 0;
                if (i == 0) {
                    while (j < s.length()) {
                        j += 2*n-2;
                        if (j >= s.length()) {
                            break;
                        }
                        s2 += s.charAt(j);
                    }
                } else if (i == n-1) {
                    j = i;
                    s2 += s.charAt(i);
                    while (j < s.length()) {
                        j += 2*n-2;
                        if (j >= s.length()) {
                            break;
                        }
                        s2 += s.charAt(j);
                    }
                } else {
                    j = i;
                    s2 += s.charAt(i);
                    while (j < s.length()) {
                        j += (n - i - 1)*2;
                        if (j >= s.length()) {
                            break;
                        }
                        s2 += s.charAt(j);
                        j += 2*i;
                        if (j >= s.length()) {
                            break;
                        }
                        s2 += s.charAt(j);
                    }
                }
                i++;
            }
            System.out.println(s2);
        }

    }
}
