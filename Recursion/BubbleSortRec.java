package Recursion;

import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        sort(arr, arr.length-1, 0);
    }

    public static void sort(int[] arr, int l, int c) {
        if (l == 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (l == c) {
            sort(arr, --l, 0);
        } else{
            if (arr[c] <= arr[c + 1]) {
                sort(arr, l, ++c);
            } else {
                int temp = arr[c + 1];
                arr[c + 1] = arr[c];
                arr[c] = temp;
                sort(arr, l, ++c);
            }
        }
    }
}

