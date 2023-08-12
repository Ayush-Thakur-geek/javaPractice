package com.thakur;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] nums={3,6,7,11};
        int k=8;
        int start = nums[0];
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            end += nums[i];
        }
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start)/2;
            // calculate how many pieces you can divide this in which this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (num<=mid) {
                    if (sum + num > mid) {
                        //you cannot add this in this subarray, make new one
                        // say add this num in new subarray, then sum = num
                        sum = num;
                        pieces ++;
                    } else {
                        sum += num;
                    }
                } else {
                    num=num-mid;
                    pieces=pieces+2;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        System.out.println(end);
    }
}
