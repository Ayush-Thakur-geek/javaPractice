package com.thakur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_3 {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>> r=new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++) {
            if (i>0 && arr[i]==arr[i-1]) {
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while (j<k) {
                int sum=arr[i]+arr[j]+arr[k];
                if (sum==0) {
                    r.add(Arrays.asList(arr[i],arr[j],arr[k]));
                }
                while (j<k && arr[j]==arr[j+1]) {
                    j++;
                }
                while (j<k && arr[k]==arr[k-1]) {
                    k++;
                }
                j++;
                k--;
                if (sum<0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        System.out.println(r);
    }
}
