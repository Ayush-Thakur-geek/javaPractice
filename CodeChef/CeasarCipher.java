package CodeChef;

import java.util.*;

public class CeasarCipher {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        in.nextLine(); // consume the newline character

        while (q > 0) {
            int n = in.nextInt();
            in.nextLine(); // consume the newline character

            String s = in.nextLine();
            String t = in.nextLine();
            String u = in.nextLine();

            int diff = (int)(t.charAt(0)-s.charAt(0));
            String ans = "";
            for (int i = 0; i < n; i++) {
                if ((int)u.charAt(i) + diff > 122) {
                    ans += (char) ((int)u.charAt(i)+diff-26);
                } else {
                    ans += (char) ((int)u.charAt(i)+diff);
                }
            }
            System.out.println(ans);
            q--;
        }
    }
}
