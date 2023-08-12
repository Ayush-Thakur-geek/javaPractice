package Leetcode;
import java.util.*;

public class LuckyNo {
    public static void main(String[] args) {
        int[][] matrix = {{3,6},
                {7,1},
                {5,2},
                {4,8}
        };
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int min2=0;
        for (int i=0;i<matrix[0].length;i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            min2=min;
            for (int j=0;j<matrix.length;j++) {
                // if (min>matrix[i][j]) {
                //     min=matrix[i][j];
                // }
                if (max<matrix[j][i]) {
                    max=matrix[j][i];
                }
                if (j==matrix.length-1) {
                    // l1.add(min);
                    l1.add(max);
                }

            }
        }
        for (int i=0;i<l1.size();i++) {
            if (min2>l1.get(i)) {
                min2=l1.get(i);
            }
            if (i==l1.size()-1) {
                l2.add(min2);
            }
        }
        System.out.println(l2);
    }
}
