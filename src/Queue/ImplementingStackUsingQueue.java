package Queue;

class MyStack {
    int[] data;
    int DEFAULT_SIZE = 10;
    int ptr = -1;
    int size = 0;
    public MyStack() {
        data = new int[DEFAULT_SIZE];
    }

    public void push(int x) {
        data[++ptr] = x;
        size++;
    }

    public int pop() {
        int count = 0;
        int ans = 0;
        int tempPtr = ptr - 1;
        while(count < size) {
            int out = data[0];
            int[] temp = new int[data.length];
            for (int i = 0; i < data.length-1; i++) {
                temp[i] = data[i+1];
            }
            ptr--;
            data = temp;
            if (count == size - 1) {
                ans = out;
            } else {
                push(out);
            }

            size--;
            count++;
        }
        ptr = tempPtr;

        return ans;
    }

    public int top() {
        return data[ptr];
    }

    public boolean empty() {
        return ptr == -1;
    }
}
public class ImplementingStackUsingQueue {
    public static void main(String[] args) {
        MyStack s1 = new MyStack();
        s1.push(1);
        s1.push(2);
        System.out.println(s1.top());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.empty());
    }
}
