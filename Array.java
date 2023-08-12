package com.thakur;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax
        // datatype[] variable name = new datatype[size];
        // store 5 roll no:

//        int[] rnos = new int[5];
//        //or directly
//        int [] rnos2 = {32, 43, 89, 90, 12};

//        int[] ros; // declaration of array ros is getting in the stack
//        ros = new int[5]; // initialisation: actually here object is being created in the heap memory
        int[] arr = new int[3];
//        arr[0] = 1;
//        arr[1] = 3;
//        arr[2] = 6;
        // {1,3,6}
//
//         System.out.println(arr[2]);

        // input using loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        for (int num : arr) { // for every element in the array print the element
//            System.out.println(num + " "); // here num represents elements of the array
//        }


//        String[] str = new String[3];
//        for (int i = 0; i < str.length; ++i) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));
//
//        // modify
//        str[1] = "Ayush";
//        System.out.println(Arrays.toString(str));
    }


}


