
package com.thakur;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = in.nextInt();
        int count = 3;
        while (count <= n) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
