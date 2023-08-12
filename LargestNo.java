package com.thakur;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a - ");
            int a = in.nextInt();
            System.out.print("Enter b - ");
            int b = in.nextInt();
            System.out.print("Enter c - ");
            int c = in.nextInt();
            int max = a;
            if (b>a) {
                max = b;
            }
            if (c>max) {
                max = c;
            }
            System.out.println(max + " - Largest no");
            if (a == '0') {
                break;
            }
        }

    }
}