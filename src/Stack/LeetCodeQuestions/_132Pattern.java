package Stack.LeetCodeQuestions;

import java.util.Stack;

public class _132Pattern {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int two = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            int curr = nums[i];
            if (curr < two) {
                return true;
            }
            while (!st.isEmpty() && curr > st.peek()) {
                two = st.pop();
            }
            st.push(curr);
        }
        return false;
    }
}

class Cases {
    public static void main(String[] args) {
        _132Pattern p = new _132Pattern();
        int[] nums = {3,1,4,2};
        System.out.println(p.find132pattern(nums));
    }
}