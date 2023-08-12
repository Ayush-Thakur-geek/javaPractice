package com.thakur;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int employID = in.nextInt();
        String department = in.next();


        switch (employID) {
            case 1 -> System.out.println("Ayush Thakur");
            case 2 -> System.out.println("Lakshay");
            case 3 -> System.out.println("Aryan");
            case 4 -> {
                System.out.println("Employ no 4 - ");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
                System.out.println("Enter Correct Employ ID");
            }
            default -> System.out.println("Enter Correct Employ ID");
        }
    }
}
