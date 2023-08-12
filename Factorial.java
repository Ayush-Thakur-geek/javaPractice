package com.thakur;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The No = ");
        int n = in.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
    }
}
