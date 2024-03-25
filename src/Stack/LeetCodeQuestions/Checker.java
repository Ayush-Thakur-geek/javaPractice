package Stack.LeetCodeQuestions;

import java.util.Stack;

public class Checker {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        RemoveOutermostParentheses r = new RemoveOutermostParentheses();
        System.out.println(r.removeOuterParentheses(s));
    }


}
class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (!st.isEmpty()) {
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
