package com.thakur;

import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius = ");
        double r = in.nextDouble();
        double ans1 = Area(r);
        System.out.println("Area = " + ans1);
        double ans2 = circumference(r);
        System.out.println("Circumference = " + ans2);
        in.close();
    }
    static double Area(double r) {
        double area = 2 * (3.14) * (r * r);
        return area;
    }
    static double circumference(double r) {
        double circum = 2 * (3.14) * r;
        return circum;
    }
}
