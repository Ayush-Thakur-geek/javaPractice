package com.thakur;

public class AllocateMinNoOfPages {
    public static void main(String[] args) {
        int[] A={13, 31, 37, 45, 46, 54, 55, 63, 73, 84, 85};
        int N=A.length;
        int M=9;
        int start=0;
        int end=0;
        int p=1;
        for (int i=0;i<N-1;i++) {
            end+=A[i];
        }
        while (start<end) {
            int mid=start+(end-start)/2;
            int sum=0;
            for (int i=0;i<N;i++) {
                if (sum+A[i]>mid) {
                    p++;
                    sum=A[i];
                } else {
                    sum+=A[i];
                }
            }
            if (p>M) {
                start=mid+1;
            } else {
                end=mid;
            }
        }
        System.out.println(end);
    }
}
