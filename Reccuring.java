package com.thakur;

import java.util.Scanner;

public class Reccuring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The No. = ");
        int n = in.nextInt();
        int count = 0;
        while (n>0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n /= 10;
        }
        if (count == 1) {
            System.out.println("Reoccured 1 time");
        }
        if (count != 1) {
            System.out.println("Reoccured " + count + " times");
        }
    }
}
