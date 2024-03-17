package Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    public boolean insert(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int out = data[front++];
        front = front % data.length;
        size--;
        return out;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
            System.out.println("END");
    }

    protected boolean isEmpty() {
        return size == 0;
    }

    protected boolean isFull() {
        return size == data.length;
    }
}
