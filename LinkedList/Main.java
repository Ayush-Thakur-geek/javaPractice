package LinkedList;

public class Main {
    public static void main(String[] args) {
        Singly list = new Singly();
        list.insertionFirst(1);
        list.insertionFirst(2);
        list.insertionFirst(3);
        list.insertionLast(0);
        list.insert(5, 2);
        list.display();
//        list.deleteFirst();
//        list.deleteLast();
        list.delete(2);
        list.display();

    }
}
