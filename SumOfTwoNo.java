package com.thakur;

import java.util.Arrays;

public class SumOfTwoNo {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        System.out.println(Arrays.toString(search(numbers,9)));

    }
    static int[] search(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int sum=numbers[start]+numbers[end];
        while (start<end) {
            if (sum==target) {
                return new int[]{start+1,end+1};
            } else if (sum<target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
