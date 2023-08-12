package com.thakur;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
