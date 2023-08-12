package Recursion;

public class PrimeRecursion {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(prime(n, 2));
    }
    static boolean prime(int n, int i) {
        if (i == n) {
            return true;
        } else if (n%i == 0) {
            return false;
        }
        return prime(n, ++i);
    }
}
