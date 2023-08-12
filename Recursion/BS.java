package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 3;
        System.out.println(BinarySearch(arr, target, 0, arr.length-1));
    }
    public static int BinarySearch(int[] arr, int target, int s, int e) {
        int mid = s + (e - s)/2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return BinarySearch(arr, target, s, mid - 1);
        }
        return BinarySearch(arr, target, mid + 1, e);
    }
}
