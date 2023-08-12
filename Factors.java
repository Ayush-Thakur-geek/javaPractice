package com.thakur;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The No. - ");
        int num = in.nextInt();

//        for (int i = 1; i <= num; ++i) {
//            if (num % i == 0) {
//                System.out.println(i);
//            }
//        }

        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
