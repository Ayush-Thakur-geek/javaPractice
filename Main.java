package com.thakur;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());
        System.out.print("Please Enter Your Name - ");
        String name = input.nextLine();
        System.out.println("Welcome Mam - " + name);
        System.out.print("Please Enter Your Sr no : ");
        int srno = input.nextInt();
        int hashrollno = 97 / 5;
        int finalrollno = hashrollno % srno;
        System.out.println("Your Roll NO. is : " + finalrollno);


//        int smallvalue = 77;
//        char letter = 'a';
//        float decimalvalue = 67.86F;
//        double largedecimalvalue = 56384848.34796785478954987;
//        long largevalue = 73478784563567887L;
//        boolean check = true;


//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        System.out.println(num2 + num1);
    }
}