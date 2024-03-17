package recursion.subset;

public class CountGoodNumbers {
    public static void main(String[] args) {
        int n = 50;
        long MOD = 1_000_000_007;
        int odd = n/2;
        int even = n - odd;
        System.out.println(count3(5, odd) * count3(4, even) % MOD);
        System.out.println(count2(n)%MOD);
    }
    static int count(String p, int up) {
        int c = 0;
        if (up == 0) {
            boolean good = false;
            for (int i = 1; i < p.length(); i++) {
                int n = Character.getNumericValue(p.charAt(i));
                if (i % 2 == 0 && n % 2 == 0) {
                    good = true;
                } else if (i % 2 != 0 && isPrime(n)) {
                    good = true;
                } else {
                    good = false;
                    break;
                }
            }
            if (good == true) {
                return 1;
            }
            return 0;
        }
        for (int i = 0; i <= 9; i++) {
            if (p.isEmpty()) {
                if (i%2==0) {
                    c += count(p + i, up - 1);
                } else {
                    continue;
                }
            } else {
                c += count(p + i, up - 1);
            }
        }

        return c;
    }
    static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long count2(int n) {
        long c = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                c *= 5;
            } else {
                c *= 4;
            }
        }
        return c;
    }

    static long count3(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            long r = count3(x, n/2);
            if (n % 2 == 0) {
                return (r*r)%1000000007;
            } else {
                return ((r*r*x)%1000000007);
            }
        }
    }
}
