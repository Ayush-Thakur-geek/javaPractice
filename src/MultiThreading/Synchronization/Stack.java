package MultiThreading.Synchronization;

public class Stack {
    int[] arr;
    private int stackTop;
    Object lock;

    public Stack(int capacity) {
        arr = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }
    public boolean isEmpty() {
        return (stackTop < 0);
    }
    public boolean isFull() {
        return (stackTop >= arr.length - 1);
    }
    public boolean push(int elem) {
        synchronized (this) {
            if (isFull()) {
                return false;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            arr[++stackTop] = elem;
            return true;
        }
    }

    public synchronized int pop() {
        synchronized (this) {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int obj = arr[stackTop];
            arr[stackTop--] = Integer.MIN_VALUE;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }
    }
}