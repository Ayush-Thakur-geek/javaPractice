package com.thakur;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("No of digits = ");
        double d = in.nextDouble();
        System.out.print("The No = ");
        double n = in.nextDouble();
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        double avg = sum / d;
        System.out.println("The Avg = " + avg);
    }
}
