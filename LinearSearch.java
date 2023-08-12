package com.thakur;

public class LinearSearch {
    public static void main(String[] args) {
        int[] n = {1,2,3,36,12,37,45,78,15,68};
        int target = 36;
        int ans = LinearSearch(n, target);
        System.out.println(ans);
    }
    // search in the array: return the undex if item found
    // otherwise if item not found return -1
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop

        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // this line will execute if none of the above returns value
        // hence, the value is not found
        return -1;
    }
}
