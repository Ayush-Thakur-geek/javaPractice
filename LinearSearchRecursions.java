import java.lang.module.FindException;
import java.util.ArrayList;

public class LinearSearchRecursions {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,34,34,23};
        System.out.println(Index(arr, 34, 0));
        System.out.println(Index1(arr, 34, arr.length-1));
//        findIndex(arr, 34, 0);
//        System.out.println(list);
        System.out.println(index(arr, 34, 0, list));
        System.out.println(index1(arr, 34, 0));
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static int Index(int[] arr, int target, int i) {
        if (i== arr.length) {
            return -1;
        }
        if (arr[i]==target) {
            return i;
        } else {
            return Index(arr, target, i+1);
        }
    }
    static int Index1(int[] arr, int target, int i) {
        if (i==-1) {
            return -1;
        }
        if (arr[i]==target) {
            return i;
        } else {
            return Index1(arr, target, i-1);
        }
    }
    static void findIndex(int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i]==target) {
            list.add(i);
        }
        findIndex(arr, target, i+1);
    }
    static ArrayList index(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i]==target) {
            list.add(i);
        }
        return index(arr, target, i+1, list);
    }
    static ArrayList<Integer> index1(int[] arr, int target, int i) {
        ArrayList<Integer> list=new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i]==target) {
            list.add(i);
        }
        ArrayList<Integer> ansFromBelow=index1(arr, target, i+1);
        list.addAll(ansFromBelow);
        return list;
    }
}
