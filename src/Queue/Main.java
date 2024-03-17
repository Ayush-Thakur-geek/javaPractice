package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(2);
        queue.insert(1);
        System.out.println(queue.remove());
        queue.insert(2);
        queue.insert(3);
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
