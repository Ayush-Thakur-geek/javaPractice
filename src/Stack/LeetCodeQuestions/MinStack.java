package Stack.LeetCodeQuestions;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        int peek = stack.pop();
        if (peek == min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}


class Test {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
//        obj.push(0);
//        System.out.println(obj.top());
//        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
//        System.out.println(obj.getMin());
//        obj.pop();
//        obj.push(2147483647);
        System.out.println(obj.top());
        System.out.println(obj.getMin());
//        obj.push(-2147483648);
//        System.out.println(obj.top());
//        System.out.println(obj.getMin());
//        obj.pop();
//        System.out.println(obj.getMin());
    }
}