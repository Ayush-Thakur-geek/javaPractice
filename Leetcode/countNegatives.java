package Leetcode;

public class countNegatives {
    public static void main(String[] args) {
        int[][] arr = {
                {5,1,0},
                {-5,-5,-5}
//                {},
//                {-1, -1, -2, -3}
        };
        System.out.println(Search(arr));
    }
    static int Search(int[][] arr) {
        int count=0;
        for (int i=arr.length-1;i>=0;i--) {
            int s=0;
            int e=arr[0].length-1;
            while (s<=e) {
                int mid=s+(e-s)/2;
                if (arr[i][mid]>=0) {
                    s=mid+1;
                } else {
                    count+=e-mid+1;
                    e=mid-1;
                }
            }
        }
        return count;
    }
}
