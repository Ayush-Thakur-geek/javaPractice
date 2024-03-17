package Stack.LeetCodeQuestions;

import java.util.Stack;

public class largestRectangleArea {
    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        Solution sol = new Solution();
        System.out.println(sol.largestRectangleArea(heights));

    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < heights.length; i++) {
//            int count = 0;
//            int ar = 0;
//            for (int j = 0; j < heights.length; j++) {
//                if (heights[j] >= heights[i]) {
//                    count++;
//                } else if (heights[j] < heights[i] && i > j) {
//                    count = 0;
//                } else {
//                    break;
//                }
//            }
//            ar = count * heights[i];
//            if (ar > max) {
//                max = ar;
//            }
//        }
//        for (int i = 1; i <= heights.length; i++) {
//            if (st.isEmpty() || (i < heights.length && heights[i] >= heights[st.peek()])) {
//                st.push(i);
//            } else {
//                int h = heights[st.pop()];
//                int w = st.isEmpty() ? i : i - st.peek() - 1;
//                max = Math.max(max, h*w);
//            }
//        }
        st.push(0);
        for (int i = 1; i < heights.length; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                max = getMax(heights, max, st, i);
            }
            st.push(i);
        }
        int i = heights.length;
        while (!st.isEmpty()) {
            max = getMax(heights, max, st, i);
        }
        return max;
    }

    private int getMax(int[] h, int max, Stack<Integer> st, int i) {
        int ht = h[st.pop()];
        int w = st.isEmpty() ? i : (i - st.peek() - 1);
        return Math.max(max, ht*w);
    }
}