package Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    public boolean insert(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        end++;
        data[end] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int out = data[0];
        int[] temp = new int[data.length];
        for (int i = 0; i < data.length-1; i++) {
            temp[i] = data[i+1];
        }
        data = temp;
        end--;
        return out;
    }

    public void display() {
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println("END");
    }

    private boolean isEmpty() {
        return end == -1;
    }

    private boolean isFull() {
        return end == data.length - 1;
    }
}
