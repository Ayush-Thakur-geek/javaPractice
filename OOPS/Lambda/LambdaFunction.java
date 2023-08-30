package OOPS.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
//        arr.forEach((item) -> System.out.println(item * 2));

//        Consumer<Integer> x = (item) -> System.out.println(item * 2);

//        arr.forEach(x);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;

        LambdaFunction calculator = new LambdaFunction();
        System.out.println(calculator.operate(5, 3, sum));
    }
    private int operate(int a, int b, Operation o) {
        return o.op(a, b);
    }
}

interface Operation {
    int op(int a, int b);
}
