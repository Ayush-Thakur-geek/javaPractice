package com.thakur;

public class CountingEvenNo {
    public static void main(String[] args) {
        int[] nums = {111,32,432,56,79};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(-3469786));
    }
    static  int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    // function to check whether the no contains an even no or not
    private static boolean even(int num) {
        int numberofDigits = digits(num);
//        if (numberofDigits % 2 == 0) {
//            return true;
//        }
//        return false;

        // OR

        return numberofDigits % 2 == 0;

    }
    static int digits2(int num) {
        if (num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1; // Shortcut for calculating no of digits
    }

    // Count no. of digits
    static int digits(int num) {
//        if (num < 0) {
//            num *= -1;
//        }
//        if (num == 0) {
//            return 1;
//        }
//        int count = 0;
//        while(num > 0) {
//            count++;
//            num = num/10; // or num /= 10
//        }
//        return count;

        // Or

        if (num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
