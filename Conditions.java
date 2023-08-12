package com.thakur;

public class Conditions {
    public static void main(String[] args) {
        /*
        Syntax of if statements:
        if (boolean expressions T or F) {
            // body
        } else {
            //do this
       */

        int salary = 11400;
//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        //multiple if-else

        if (salary > 20000) {
            salary += 3000;   // Shortcut for salary = salary + 2000
        } else if (salary > 10000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
