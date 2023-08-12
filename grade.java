package com.thakur;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Marks = ");
        int marks = in.nextInt();
        double cgpa = (int)(marks / 10);
        switch ((int) cgpa) {
            case 9 -> System.out.println("Grade: AA");
            case 8 -> System.out.println("Grade: AB");
            case 7 -> System.out.println("Grade: BB");
            case 6 -> System.out.println("Grade: BC");
            case 5 ->System.out.println("Grade: CD");
            case 4 -> System.out.println("Grade: DD");
            case 3 -> System.out.println("Grade: Fail");
        }
        if (cgpa == 10) {
            System.out.println("Grade: AA");
        }
    }
}
