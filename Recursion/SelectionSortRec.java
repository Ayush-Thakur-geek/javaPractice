package Recursion;

import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        sort(arr, 0, arr.length-1, 0);
    }
    public static void sort(int[] arr, int max, int l, int c) {
        if (l == 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (l == c) {
            if (arr[max] < arr[l]) {
                sort(arr, 0, --l, 0);
            } else {
                int temp = arr[l];
                arr[l] = arr[max];
                arr[max] = temp;
                sort(arr, 0, --l, 0);
            }

        } else {
            if (arr[max] < arr[c]) {
                sort(arr, c, l, ++c);
            } else {
                sort(arr, max, l, ++c);
            }
        }
    }
}
