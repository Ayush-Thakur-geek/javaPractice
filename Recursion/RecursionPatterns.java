package Recursion;

public class RecursionPatterns {
    public static void main(String[] args) {
        triangle2(4,0);
    }
    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle1(r,++c);
        } else {
            System.out.println();
            triangle1(r-1,0);
        }
    }
    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r,++c);
            System.out.print("*");
        } else {
            triangle2(r-1,0);
            System.out.println();
        }
    }
}
