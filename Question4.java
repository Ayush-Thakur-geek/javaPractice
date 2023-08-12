package com.thakur;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter The Year - ");
        int a = input.nextInt();
        int year = a % 4;
        if (year == 0) {
            System.out.println("The Year Is A Leap Year");
        } else {
            System.out.println("The Year Is Not A Leap Year");
        }








            //            System.out.print(a + " - Is A Leap Year ");
//        }
//        if (year != 0) {
//            System.out.print(a + " - Is Not A Leap Year ");
 //       }
    }
}
