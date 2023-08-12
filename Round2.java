package com.thakur;

import java.util.Scanner;

public class Round2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count = 0;
        while (count < t) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int max = x;
            if (max < y) {
                max = y;
            }
            if (max < z) {
                max = z;
            }
            if (max == x) {
                System.out.println("Setter");
            } else if (max == y) {
                System.out.println("Tester");
            } else if (max == z) {
                System.out.println("Editorialist");
            }
            count++;
        }
    }
}
