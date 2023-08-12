package com.thakur;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Sum4 {
    public static void main(String[] args) {
        int[] nums={1000000000,1000000000,1000000000,1000000000};
        int target=-294967296;
        List<List<Integer>> r=new ArrayList<>();
        if (nums==null || nums.length==0) {
            System.out.println(r);;
        }
        Arrays.sort(nums);
        int n=nums.length;
        for (int i=0;i<n;i++) {
            if(nums[i]>target && nums[i]>0) break;
            for (int j=i+1;j<n;j++) {
                int target2=target-nums[i]-nums[j];
                int l=j+1;
                int k=n-1;
                while (l<k) {
                    int sum=nums[l]+nums[k];
                    if (target2>sum) {
                        l++;
                    } else if (target2<sum) {
                        k--;
                    } else if (target2==sum){
                        List<Integer> re=new ArrayList();
                        re.add(nums[i]);
                        re.add(nums[j]);
                        re.add(nums[l]);
                        re.add(nums[k]);
                        r.add(re);
                        while (l<k && nums[l]==re.get(2)) {
                            l++;
                        }
                        while (l<k && nums[k]==re.get(3)) {
                            k--;
                        }
                    }
                }
                while (j+1<n && nums[j+1]==nums[j]) {
                    j++;
                }
                while (i+1<n && nums[i+1]==nums[i]) {
                    i++;
                }
            }
        }
        System.out.println(r);;
    }
}
