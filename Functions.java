package com.thakur;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        /*

            access modifier (detail in oop) return type name () {
                //body
                return statement;
            }
         */


//        String message = greet();
//        System.out.println(message);

//        int sum = sum3(40, 50);
//        System.out.println(sum);


        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name -> ");
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }



//    static int sum2 () {
//        Scanner in = new Scanner(System.in);
//        System.out.print("No1 = ");
//        int num1 = in.nextInt();
//        System.out.print("No2 = ");
//        int num2 = in.nextInt();
//        int sum = num2 + num1;
//        System.out.println("The sum = " + sum);
//        return sum;
//
//    }


//     static void  sum () {
//        Scanner in = new Scanner(System.in);
//         System.out.print("No1 = ");
//         int num1 = in.nextInt();
//         System.out.print("No2 = ");
//         int num2 = in.nextInt();
//         int sum = num2 + num1;
//         System.out.println("The sum = " + sum);
//     }


//    static String greet() {
//        String greeting = "How are you";
//        return greeting;
//    }

//    static int sum3 (int a, int b) {
//        int sum = a + b;
//        return sum;
//    }
}
