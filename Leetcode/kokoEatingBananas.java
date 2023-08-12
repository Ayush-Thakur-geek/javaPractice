package Leetcode;

public class kokoEatingBananas {
    public static void main(String[] args) {
        int[] nums={30,11,23,4,20};
        int h=5;
        int lb=1;
        int ub=-1;
        for (int i=0;i<nums.length;i++) {
            ub=Math.max(ub,nums[i]);
        }
        int m=0;
        while (lb<ub) {
            m=lb+(ub-lb)/2;
            int p=count(nums,m);
            if (h<p) {
                lb=m+1;
            } else {
                ub=m;
            }
        }
        System.out.println(lb);

    }
    static int count(int[] nums,int m) {
        int hours = 0;
        for(int pile : nums){
            int div = pile / m;
            hours += div;
            if(pile % m != 0) hours++;
        }
        return hours;
    }
}
