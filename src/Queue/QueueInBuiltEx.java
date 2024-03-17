package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInBuiltEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(45);
        deque.add(4);
        deque.add(5);
        deque.addLast(25);
        System.out.println(deque.removeLast());
    }
}
