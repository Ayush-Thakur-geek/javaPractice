package com.thakur;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);
//        }
//        static boolean isArmstrong(int n) {
//            int original = n;
//            int sum = 0;
//            while (n>0) {
//                int rem = n % 10;
//                int cube = rem * rem * rem;
//                sum += cube;
//                n /= 10;
//            };
//            return sum == original;
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        int a = arr1.length;
        int b = arr2.length;
        int c = a + b;
        int[] nums = new int[c];
        for (int i=0;i<a;i++) {
            nums[i]=arr1[i];

        }
        for (int j=0;j<b;j++) {
            nums[j+a]=arr2[j];
        }
        System.out.println(c);
    }
}
