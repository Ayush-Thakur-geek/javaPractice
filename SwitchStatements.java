package com.thakur;


import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the name of fruit (The first letter should be in uppercase) - ");
//        String fruit = in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of the fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
