package com.thakur;

import java.util.Scanner;

public class LoopQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Value of a - ");
        int a = input.nextInt();
        System.out.print("Value of b - ");
        int b = input.nextInt();
        System.out.print("Value of c - ");
        int c = input.nextInt();

        //Q1: Find the largest no of the 3 nos.

        int max = a;
        if (b>max) {
            max = b;
        }
        if (c>max) {
            max = c;
        }

        // Or -

//        int max = 0;
//        if (a>b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c>max) {
//            max = c;
//        }
        System.out.print(max + " - Largest No.");



    }
}
