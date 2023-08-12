package com.thakur;
import java.util.*;

public class DistinctPrimeFactorsOfProductOfArray {
    public static void main(String[] args) {
        int[] nums={2,4,3,7,10,6};
        ArrayList<Integer> l=new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            if (printPrime(nums[i])) {
                l.add(nums[i]);
            } else {
                for (int j=2;j<=nums[i]/2;j++) {
                    if (nums[i]%j==0) {
                        l.add(j);
                    }
                }
            }
        }
        Collections.sort(l);
        for (int i = l.size() - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (l.get(i).equals(l.get(j))) {
                    l.remove(j);
                    break;
                }
            }
        }
        int count=l.size();
        System.out.println(count);
    }
    static boolean printPrime(int n) {
        boolean[] prime=new boolean[n+1];
        for (int i=2;i*i<=n;i++) {
            if (prime[i]==false) {
                for (int j=i*i;j<=n;j=j+i) {
                    prime[j]=true;
                }
            }
        }
        if (prime[n]==false) {
            return true;
        }
        return false;
    }
}
