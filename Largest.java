package com.thakur;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The 1st No. = ");
        int a = in.nextInt();
        System.out.print("Enter The 2nd No = ");
        int b = in.nextInt();
        System.out.print("Enter the 3rd No = ");
        int c = in.nextInt();
        int max = Math.max(c, Math.max(a,b));
        System.out.println("The Largest No = " + max);
    }
}
