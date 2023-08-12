package com.thakur;

public class Pattern{
    public static  void main(String[] args){
        pattern11(5);
        System.out.println();
        pattern12(5);
    }
    static void pattern11(int n) {
        for (int i=1;i<=n;i++) {
            for (int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n) {
        for (int i=1;i<=2*n;i++) {
            if (i<=n) {
                for (int j=1;j<i;j++) {
                    System.out.print(" ");
                }
                for (int k=n;k>=i;k--) {
                    System.out.print("* ");
                }
            } else {
                for (int j=n;j>i-n;j--) {
                    System.out.print(" ");
                }
                for (int k=1;k<=i-n;k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void pattern13(int n) {
        for (int i=1;i<=n;i++) {
            if (i<n) {
//                for (int j=)
            }
        }
    }
}