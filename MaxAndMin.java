package com.thakur;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter No1 = ");
        int a = in.nextInt();
        System.out.print("Enter No2 = ");
        int b = in.nextInt();
        System.out.print("Enter No3 = ");
        int c = in.nextInt();
        int ans1 = isMax(a,b,c);
        System.out.println("The Largest No = " + ans1);
        int ans2 = isMin(a,b,c);
        System.out.println("The Smallest No = " + ans2);
    }
    static int isMax(int a,int b,int c) {
        int max = a;
        if (b>a) {
            max = b;
        }
        if (c>a) {
            max = c;
        }
        return max;
    }
    static int isMin(int a, int b, int c) {
        int min = a;
        if (b<a) {
            min = b;
        }
        if (c < a) {
            min = c;
        }
        return min;
    }
}
