package generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ex <T extends Serializable,V>{
    T thingToPrint;
    V thingToPrint2;

    public Ex(T thingToPrint, V thingToPrint2) {
        this.thingToPrint = thingToPrint;
        this.thingToPrint2 = thingToPrint2;
    }

    public void print() {
        System.out.println(thingToPrint);
        System.out.println(thingToPrint2);
    }
}

class Test {
    public static void main(String[] args) {
        Ex<Integer, String> e = new Ex<>(5, "Hello");
        e.print();
        shout("Hello", "bye");
        shout(5, 20.0);
        List<Integer> integerList = new ArrayList<>();
        printList(integerList);
    }
    private static <T, V> void shout (T thingsToShout, V thingsToShout2) {
        System.out.println(thingsToShout);
        System.out.println(thingsToShout2);
    }
    private static void printList(List<?> myList) {
        System.out.println();
    }
}