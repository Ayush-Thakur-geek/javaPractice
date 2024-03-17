package Stack.LeetCodeQuestions;

import MultiThreading.Synchronization.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Question s = new Question();
        System.out.println(s.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }
}
//s = "3[abc]"
//aaa
class Question {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                n = n * 10 + s.charAt(i) - '0';
            } else if (s.charAt(i) == '[') {
                int j = i;
                int counter = 1;
                while (counter != 0) {
                    j++;
                    if (s.charAt(j) == '[') {
                        counter++;
                    } else if (s.charAt(j) == ']') {
                        counter--;
                    }
                }
                String temp = decodeString(s.substring(i + 1, j));
                for (int k = 0; k < n; k++) {
                    sb.append(temp);
                }
                n = 0;
                i = j;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}