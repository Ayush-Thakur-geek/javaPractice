package com.thakur;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,5,6};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,4));
    }
//    static int max (int[] arr) {
//        int maxVal = arr[0];
//       if (arr[1]>arr[0]) {
//           max = arr[1];
//       }
//        if (arr[2]>max) {
//            max = arr[2];
//        }
//        if (arr[3]>max) {
//            max = arr[3];
//        }
//        if (arr[4]>max) {
//            max = arr[4];
//        }
//        if (arr[5]>max) {
//            max = arr[5];
//        }
//        return  max;

        // or

//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > maxVal) {
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;


//    }

    // for range
    static int maxRange (int[] arr, int start, int end) {
        int maxVal = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
