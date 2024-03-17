package Stack.LeetCodeQuestions;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Solution2 sol2 = new Solution2();
        System.out.println(sol2.isValid("["));
    }
}

class Solution2 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                char opp = '(';
                if (s.charAt(i) == ']') {
                    opp = '[';
                } else if (s.charAt(i) == '}') {
                    opp = '{';
                }
                if (!st.isEmpty() && st.peek() == opp) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}