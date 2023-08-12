package com.thakur;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 100 && n >= 91) {
            System.out.println("Grade: AA");
        }
        if (n <= 90 && n >= 81) {
            System.out.println("Grade: AB");
        }
        if (n <= 80 && n >= 71) {
            System.out.println("Grade: BB");
        }
        if (n <= 70 && n >= 61) {
            System.out.println("Grade: BC");
        }
        if (n <= 60 && n >= 51) {
            System.out.println("Grade: CD");
        }
        if (n <= 50 && n >= 41) {
            System.out.println("Grade: DD");
        }
        if (n <= 40) {
            System.out.println("Grade: Fail");
        }
    }
}
