package CollegeJava.Graded;

import java.util.Arrays;

public class Class {
    public static void main(String[] args) {
        int[] a = new int[3];
        System.out.println(a.getClass().getSuperclass());
        print(new int[]{1, 2, 3});
    }
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
