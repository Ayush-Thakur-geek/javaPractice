package com.thakur;

import java.util.Scanner;

public class Round1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the balance -> ");
        int balance = in.nextInt();
        System.out.print("Amount to be withdrawl -> ");
        int x = in.nextInt();
        if (x%5 == 0) {
            System.out.println("Transaction will proceed");
            System.out.println("Transaction amount -> " + "x");
            System.out.println("Bank charges -> " + "0.5");
            float rem = balance-x-0.5f;
            System.out.println("Remaining Balance -> " + rem);
        } else {
            System.out.println("Transaction cannot be proceeded.");
        }
    }
}
