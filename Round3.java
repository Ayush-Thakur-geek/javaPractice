package com.thakur;

import java.util.Scanner;

public class Round3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = in.nextInt();
        int no = in.nextInt();
        int one = no%10;
        int ten = no%100;
        int digit = ten/10;
        int add = digit + one;
        if (menu == 1) {
            System.out.println(digit);
        } else if (menu == 2) {
            if (no % 3 == 0) {
                System.out.println("No. is multiple of 3.");
            } else {
                System.out.println("No. is not multiple of 3.");
            }
        } else {
            if (add<9) {
                System.out.println("Less than 9");
            } else {
                System.out.println("More than 9");
            }
        }
    }
}
