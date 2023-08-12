public class count_0s_Recursion {
    public static void main(String[] args) {
//        System.out.println(count0s(3020004));

        // OR

        System.out.println(count(302004));
    }
//    static int c=0;
//    static int count0s(int n) {
//        if (n%10==n) {
//            if (n==0) {
//                c++;
//                return c;
//            } else {
//                return c;
//            }
//        }
//        int rem=n%10;
//        if (rem==0) {
//            c++;
//        }
//        return count0s(n/10);
//    }

    //  OR


    static int count(int n) {
        return helper(n,0);
    }
    private static int helper(int n,int d) {
        if (n==0) {
            return d;
        }
        int rem=n%10;
        if (rem==0) {
            return helper(n/10,++d);
        }
        return helper(n/10,d);
    }
}
