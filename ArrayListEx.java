package com.thakur;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(20);
//        list.add(230);
//        list.add(203);
//        list.add(205);
//        list.add(320);


//        System.out.println(list);
//        list.set(0,12);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here, list[index] syntax will not work here.
        }
        System.out.println(list);
    }
}
