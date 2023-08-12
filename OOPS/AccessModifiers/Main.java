package OOPS.AccessModifiers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Ayush");

        obj.setNum(2);
        obj.arr = new int[]{1, 2};
        System.out.println(Arrays.toString(obj.arr));
    }
}
