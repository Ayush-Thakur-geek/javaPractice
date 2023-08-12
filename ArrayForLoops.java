package com.thakur;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayForLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));


//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
        //or
        for (int num: arr) {
            System.out.println(num + " ");
        }

    }
}
