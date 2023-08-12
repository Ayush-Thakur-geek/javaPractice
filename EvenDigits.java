package com.thakur;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {123,34,568,9890,123};
        System.out.println(FindNo(nums));
    }
    static int FindNo(int[] nums) {
        int count = 0;
        for (int num : nums) { // enhanced for loop

            //Or

            // for (int i = 0; i < nums.length; i++) {
               // int num = nums[i];


            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int NoOfDigits = digits(num);
        return NoOfDigits % 2 == 0;
    }

    private static int digits(int num) {
       if (num < 0) {
           num *= -1;
       }
       return (int) (Math.log10(num)) + 1;
    }
}
