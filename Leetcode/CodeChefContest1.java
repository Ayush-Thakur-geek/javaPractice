package Leetcode;
import java.util.Scanner;

public class CodeChefContest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (m - arr[i] >= k) {
                    ans = true;
                } else {
                    ans = false;
                    break;
                }
            }
            if (ans == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            t--;
        }
    }
}
