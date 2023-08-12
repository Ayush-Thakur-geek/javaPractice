//package OOPS.Generics;
//
//import java.util.Arrays;
//
//public class ArrayListGenerics<T> {
//    private T[] data;
//    private static int DEFAULT_SIZE = 10;
//    private int size = 0;
//
//    public ArrayListGenerics() {
//        this.data = new T[DEFAULT_SIZE];
//    }
//
//    public void add(int num) {
//        if (this.isFull()) {
//            resize();
//        }
//        data[size++] = num;
//    }
//
//    public void set(int index, int value) {
//        data[index] = value;
//    }
//
//    private void resize() {
//        int[] temp = new int[data.length*2];
//
//        for (int i = 0; i < data.length; i++) {
//            temp[i] = data[i];
//        }
//        data = temp;
//    }
//
//    public int remove() {
//        int removed = data[--size];
//        return removed;
//    }
//
//    private boolean isFull() {
//        return size == data.length;
//    }
//
//    public int get(int index) {
//        return data[index];
//    }
//
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public String toString() {
//        return "CreateArrayList " +
//                "{data = " + Arrays.toString(data) +
//                ", size = " + size +
//                '}';
//    }
//
//    public static void main(String[] args) {
////        ArrayList list = new ArrayList();
//        CreateArrayList list = new CreateArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.remove();
//
//        System.out.println(list.toString());
//    }
//}
