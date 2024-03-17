package Stack.LeetCodeQuestions;

import java.util.Stack;

public class GameOfStack {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        a.push(1);
        a.push(6);
        a.push(4);
        a.push(2);
        a.push(4);
        b.push(5);
        b.push(8);
        b.push(1);
        b.push(2);
        System.out.println(game(a, b, 10, 0, 0));
    }
    static int maxc = 0;
    public static int game(Stack<Integer> a, Stack<Integer> b, int limit, int sum, int c) {
        if (sum > limit) {
            --c;
            if (maxc < c) {
                maxc = c;
            }
            return maxc;
        } else if (sum == limit) {
            if (maxc < c) {
                maxc = c;
            }
            return maxc;
        } else {
            c++;
        }
        if (!a.isEmpty()) {
            game(a, b, limit, sum + a.pop(), c);
        }
        if (!b.isEmpty()) {
            game(a, b, limit, sum + b.pop(), c);
        }
        return maxc;
    }
}
