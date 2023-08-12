package com.thakur;
import java.util.*;
public class LargestNoString {
    public static void main(String[] args) {
        int[] nums={0,0};
        String[] n=new String[nums.length];
        for (int i=0;i<nums.length;i++) {
            n[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(n,(a,b) -> {
            String s1=a+b;
            String s2=b+a;
            return s2.compareTo(s1);
        });
        if (n[0]=="0") {
            System.out.println("0");
        }
        StringBuilder sb=new StringBuilder();
        for (String str : n) {
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}
