package Stack.LeetCodeQuestions;

import java.util.Stack;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(2);
        System.out.println(ms.pop());
//        System.out.println(ms.pop());
        System.out.println(ms.top());
    }
}

class MyStack {
    Stack<Integer> st = new Stack<>();
    int[] data;
    int DEFAULT_SIZE = 100;
    int ptr = -1;
    int top;
    public MyStack() {
        data = new int[DEFAULT_SIZE];
    }

    public void push(int x) {
        if (empty()) {
            data[++ptr] = x;
        } else {
            for (int i = ptr; i >= 0; i--) {
                st.push(data[i]);
            }
            ptr++;
            data[0] = x;
            top = x;
            int i = 1;
            while(!st.isEmpty()) {
                data[i] = st.pop();
                i++;
            }
        }
    }

    public int pop() {
        int rem;
        return rem = data[ptr--];
    }

    public int top() {
        if (empty()) {
            return 0;
        }
        return data[ptr];
    }

    public boolean empty() {
        return ptr == -1;
    }
}

