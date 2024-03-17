package Test;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println(t);
        while (t > 0) {
            String str1 = in.nextLine();

            String str2 = in.nextLine();
            int count = 0;
            System.out.println(str1.length() + " " + str2.length());
            for (int i = 0; i < str1.length(); i++) {
                char c1 = str1.charAt(i);
                System.out.println(c1);
                for (int j = 0; j < str2.length(); j++) {
                    char c2 = str2.charAt(j);
                    System.out.println(c2);
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                    }
                }

            }
            System.out.println(count);
            t--;
        }
    }
}
