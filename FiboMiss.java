package com.thakur;

import java.util.ArrayList;
import java.util.Scanner;

public class FiboMiss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(a + " ");
            } else if (i == 1) {
                System.out.print(b + " ");
            } else {
                c = a + b;
                a = b;
                b = c;
                l.add(c);
                System.out.print(c + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < l.size() - 1; i++) {
            int temp = l.get(i) + 1;
            while (temp < l.get(i+1)) {
                System.out.print(temp + " ");
                temp++;
            }
        }
    }
}