package com.thakur;

public class ShuffleString {
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        StringBuilder str=new StringBuilder();
        String[] s1 = s.split("");
        for (int i=0;i<s.length();i++) {
            int m=BS(s1,indices,i);
            str.append(s1[m]);
        }
        System.out.println(str.toString());
    }
    static int BS(String[] s1,int[] indices,int target) {
        int start=0;
        int end=s1.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (mid<target) {
                start=mid+1;
            } else if(mid>target) {
                end=mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
