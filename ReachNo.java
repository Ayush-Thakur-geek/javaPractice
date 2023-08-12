package com.thakur;

public class ReachNo {
    public static void main(String[] args) {
        System.out.println(steps(5));
    }
    static int steps(int target) {
        int steps=1;
        int sum=0;
        while (sum<target) {
            if (sum+steps<=target) {
                sum+=steps;
                if (sum==target) {
                    return steps;
                }
            } else {
                sum-=steps;
            }
            steps++;
        }
        return -1;
    }
}
