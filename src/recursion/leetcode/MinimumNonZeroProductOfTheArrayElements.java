package recursion.leetcode;

public class MinimumNonZeroProductOfTheArrayElements {
    public long MOD = (long) (1e9+7);
    public long mod(long a) {
        return a % MOD;
    }
    public long multiply(long a, long b) {
        long half = a/2;
        long ans = a * (long)Math.pow(b, half);
        return mod(ans);
    }
    public int minNonZeroProduct(int p) {
        long largest = (long)Math.pow(2, p) - 1;
        return (int)multiply(largest, largest - 1);
    }
}

class check {
    public static void main(String[] args) {
        MinimumNonZeroProductOfTheArrayElements obj = new MinimumNonZeroProductOfTheArrayElements();
        System.out.println(obj.minNonZeroProduct(5));
    }
}