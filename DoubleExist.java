package com.thakur;

public class DoubleExist {
    public static void main(String[] args) {
        int[] nums={-766,259,203,601,896,-226,-844,168,126,-542,159,-833,950,-454,-253,824,-395,155,94,894,-766,-63,836,-433,-780,611,-907,695,-395,-975,256,373,-971,-813,-154,-765,691,812,617,-919,-616,-510,608,201,-138,-669,-764,-77,-658,394,-506,-675,523};
        nums=sort(nums);
        for (int i=nums.length-1;i>0;i--) {
            if (BS(nums,nums[i],0,i-1)==true) {
                System.out.println(true);
            } else {
                continue;
            }
        }
        System.out.println(false);
    }
    static int[] sort(int[] nums) {
        boolean swap;
        for (int i=0;i<nums.length;i++) {
            swap=false;
            for (int j=1;j<nums.length-i;j++) {
                if (Math.abs(nums[j])<Math.abs(nums[j-1])) {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swap=true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return nums;
    }
    static boolean BS(int[] nums,int target,int s,int e) {
        while (s<=e) {
            if (target%2!=0) {
                break;
            }
            int m=s+(e-s)/2;
            if (target<2*nums[m]) {
                e=m;
            } else if (target>2*nums[m]) {
                s=m+1;
            } else {
                return true;
            }
        }
        return false;
    }
}
