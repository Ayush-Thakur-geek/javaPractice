package Leetcode;
import java.lang.*;

public class pow_xn {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(rec(x, n));
    }
    static int rec(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = Math.abs(n);
            x = 1/x;
        }
        if (n % 2 == 0) {
            rec(x*x, n/2);
        }
        return x * rec(x, n-1);
    }
}
