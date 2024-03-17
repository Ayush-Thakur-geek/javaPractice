package Queue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {
        if (this.isFull()) {
            int[] temp = new int[data.length*2];

            for(int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            data = temp;
        }
        front = 0;
        end = data.length;

        return super.insert(item);
    }
}
