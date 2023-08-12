package com.thakur;
import java.util.*;

public class leetcode {
    public static void main(String[] args) {
        int[] nums={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> r=new ArrayList<>();
        Arrays.sort((nums));
        for (int i=0;i< nums.length;i++) {
            int j=i+1;
            int l=j+1;
            int k= nums.length-1;
            while (j<l && l<k) {
                int sum=nums[i]+nums[j]+nums[l]+nums[k];
                if (sum>target) {
                    k--;
                } else if (sum<target) {
                    if (l==k-1) {
                        j++;
                    } else {
                        l++;
                    }
                } else {
                    r.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    break;
                }
            }
        }
        System.out.println(r);
    }
}
