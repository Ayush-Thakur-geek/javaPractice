package Leetcode;

import java.util.ArrayList;

public class ch {
    public static void main(String[] args) {
        ArrayList<Long> l = new ArrayList<>();
        String num1 = "43";
        String num2 = "4";
        int n1 = num1.length();
        int n2 = num2.length();
        int p = 10;
        long ans = 0;

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++) {
                ans = (long) (((long) (num1.charAt(n1 - 1 - j) - 48) * (long) (num2.charAt(n2 - 1 - i) - 48)) * Math.pow(p, j + i));
                l.add(ans);
            }
        }
        long temp = 0;

        for (int i = 0; i < l.size(); i++) {
            temp += l.get(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(temp);
        System.out.println(sb.toString());
    }
}
