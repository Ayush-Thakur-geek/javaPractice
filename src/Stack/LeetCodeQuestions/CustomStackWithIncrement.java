package Stack.LeetCodeQuestions;

import java.util.Stack;

public class CustomStackWithIncrement {
    int size;
    int ptr;
    int maxSize;
    int[] data;
    Stack<Integer> st = new Stack<>();
    public CustomStackWithIncrement(int maxSize) {
        this.maxSize = maxSize;
        data = new int[maxSize];
        size = 0;
        ptr = -1;
    }

    public void push(int x) {
        if (size + 1 <= maxSize) {
            data[++ptr] = x;
            size++;
        }
    }

    public int pop() {
        if (ptr > -1) {
            --size;
            return data[ptr--];
        }
        return -1;
    }

    public void increment(int k, int val) {
        int l = size;
        if (k >= l && l > 0) {
            for (int i = 0; i < l; i++) {
                st.push(pop() + val);
            }
            for (int i = 0; i < l; i++) {
                push(st.pop());
            }
        } else if (k < l) {
            for (int i = 0; i < l; i++) {

                if (i < l-k) {
                    st.push(pop());
                } else {
                    st.push(pop() + val);
                }
            }
            for (int i = 0; i < l; i++) {
                push(st.pop());
            }
        }
    }
}

class Case {
    public static void main(String[] args) {
        CustomStackWithIncrement c = new CustomStackWithIncrement(3);
        c.push(1);
        c.push(2);
        System.out.println(c.pop());
        c.push(2);
        c.push(3);
        c.push(4);
        c.increment(5, 100);
        c.increment(2, 100);
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
    }
}